package java_practice;//UDP

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Fac_server {
	
	public static int fac(int n) {
		if(n==0)return 1;
		return n*fac(n-1);
	}

	public static void main(String[] args) throws Exception {
		System.out.println("waiting for client");
		DatagramSocket ds = new DatagramSocket(6887);
		byte b[] = new byte[100];
		DatagramPacket dp = new DatagramPacket(b,100);
		ds.receive(dp);
		ByteArrayInputStream bin = new ByteArrayInputStream(b);
		DataInputStream din = new DataInputStream(bin);
		int a = din.readInt();
		int result=fac(a);
		//int area=a*a;//only have to apply the logic of factorial
		
		System.out.println(result);
        ds.close();
	}

}
