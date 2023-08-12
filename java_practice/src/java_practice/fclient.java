package java_practice;

import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class fclient {

	public static void main(String[] args) {
		
     try {
			
			Socket s = new Socket("localhost",9800);
			
			DataOutputStream dout = new DataOutputStream (s.getOutputStream());
			
			dout.writeUTF("HELLO");
			
		}
		
		catch( Exception e){
			
			
		}

	}

}
