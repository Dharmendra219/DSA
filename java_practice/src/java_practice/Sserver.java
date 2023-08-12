package java_practice;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Sserver{
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket ds = new DatagramSocket(3456);
        byte b[] = new byte[2000];
        DatagramPacket dp = new DatagramPacket(b, b.length);
        ds.receive(dp);
        String msg = new String(dp.getData());
        int len_msg = dp.getLength();
        System.out.println(len_msg);

        InetAddress ia = InetAddress.getLocalHost();
        String count = "" + len_msg;
        byte b1[] = count.getBytes();
        DatagramPacket dp1 = new DatagramPacket(b1, b1.length, ia, dp.getPort());
        ds.send(dp1);
        ds.close();
    }
}
