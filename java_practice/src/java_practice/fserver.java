package java_practice;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class fserver {
    
	public static void main(String[] args) {
		
		try {
			
			System.out.println("Waiting for client");
			
			ServerSocket ss = new ServerSocket(9800);
			
			Socket s = ss.accept();
			
			System.out.println("done");
			
			DataInputStream din = new DataInputStream (s.getInputStream());
			
			System.out.println(din.readUTF());
			
		}
		
		catch( Exception e){
			
			
		}

	}

}
