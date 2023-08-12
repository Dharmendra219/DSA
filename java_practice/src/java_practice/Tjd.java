package java_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Tjd {

	public static void main(String[] args) throws Exception {
		
		Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/p20", "root","1234");
		if( Con != null)
		{
			System.out.println("System is secure");
		}
		String sql = "INSERT INTO client(client_number,name_name) VALUES(?,?)";
		PreparedStatement statement = Con.prepareStatement(sql);
		statement.setString(1,"billgate");
		
		
	}

}
