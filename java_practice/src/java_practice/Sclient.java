package java_practice;

//import java.io.IOException;
import java.net.*;
import javax.swing.*;
public class Sclient{
    public static void main(String[] args) throws Exception {
        DatagramSocket ds = new DatagramSocket();
        String msg = JOptionPane.showInputDialog("CLIENT");
        System.out.println(msg);
        byte b[] = msg.getBytes();
        InetAddress ia = InetAddress.getLocalHost();
        DatagramPacket dp = new DatagramPacket(b, b.length, ia, 3456);
        ds.send(dp);

        byte b1[] = new byte[2000];
        DatagramPacket dp1 = new DatagramPacket(b1, b1.length);
        ds.receive(dp1);
        String count = new String(dp1.getData());
        count = count.trim();
        System.out.println(count);
        ds.close();
    }
}
