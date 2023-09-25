package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQuery {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		// This is DB connection string
		
		String dburl = "jdbc:mysql://localhost:3306/product";//make conn
		String username = "root";//make conn
		String password = "root";//make conn
		String query = "select * from product";
		
		Class.forName("com.mysql.cj.jdbc.Driver");// to load driver always
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		Statement stmt = con.createStatement(); // execute query
		ResultSet rs = stmt.executeQuery(query); 
		// see the result
	
		while(rs.next()) {
			
			System.out.print("Title: " + rs.getString("title") + "\t");
			System.out.print("productid: " + rs.getString("productid") + "\t");
			System.out.print("topic: " + rs.getString("topic") + "\t");
			System.out.println("release_year: " + rs.getString("release_year"));
		}
		
		
		
		

	}

}
