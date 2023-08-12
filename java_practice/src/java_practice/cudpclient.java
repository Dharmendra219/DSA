package java_practice;//TCP

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JOptionPane;

public class cudpclient {

	public static void main(String[] args) throws Exception {
		
		String m = JOptionPane.showInputDialog("Enter the Sentence");
		System.out.println(m);
		DatagramSocket ds = new DatagramSocket();
		byte [] b = m.getBytes();
		int l = b.length;
		InetAddress ip = InetAddress.getByName("localhost");
		int port_no = 9828;
		DatagramPacket dp = new DatagramPacket(b,l,ip,port_no);
		ds.send(dp);
		ds.close();

	}

}
