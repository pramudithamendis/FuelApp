package fuel;

import java.sql.*;
public class Fuel {

	public void printer() {
//		System.out.println("Fuel class here...");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/fuel";
			Connection con = DriverManager.getConnection(url, "root", "");
			
			Statement st = con.createStatement();
			st.executeUpdate("insert into fuel(code) values(23)");
			con.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	
	public static void main(String args[]) {

	}
}
