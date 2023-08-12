package java_practice;
import java.io.*;
import java.net.*;
public class Kserver {
	public static void main(String args[]) {
		try {
		ServerSocket ss= new ServerSocket(9800);
		Socket soc=ss.accept();
		DataInputStream din=new DataInputStream(soc.getInputStream());
		int a=Integer.parseInt(din.readUTF());
		int b=Integer.parseInt(din.readUTF());
		int sum=a+b;
		DataOutputStream dout=new DataOutputStream(soc.getOutputStream());
		dout.writeInt(sum);
		dout.close();
		soc.close();
		ss.close();
		}
		catch(IOException e) {
			
		}
	}

}
