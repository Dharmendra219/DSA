package java_practice;//udp

import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class cudpserver {

	public static void main(String args[]) throws Exception{
         
		System.out.println("waiting for client");
		DatagramSocket ds = new DatagramSocket(9828);
		byte [] b = new byte[100];
		DatagramPacket dp = new DatagramPacket(b,100);
		ds.receive(dp);
		String s = new String(dp.getData(),0,dp.getLength());
		System.out.println(s);
        int count=0;
        for(int i=0;i<s.length();i++) {
        	if(s.charAt(i) != ' ') {
        		count++;
        	}
        }
        System.out.println("Total number of characters in a sentence: "+count);
		ds.close();
		
	}

}
