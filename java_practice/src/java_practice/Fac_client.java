package java_practice;//UDP

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.*;

public class Fac_client {

	public static void main(String[] args) throws Exception {//we need to use the byte array
		DatagramSocket ds = new DatagramSocket();
		System.out.println("enter");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		DataOutputStream dout = new DataOutputStream(bout);//store the value in byte stream
		dout.writeInt(n);
		byte [] b =  bout.toByteArray();
		int l = b.length;
		InetAddress ip = InetAddress.getByName("localhost");
		DatagramPacket dp = new DatagramPacket(b,l,ip,6887);
		ds.send(dp);
		ds.close();
		sc.close();

	}

}
