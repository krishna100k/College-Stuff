package Basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class employee {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Class loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","jay4757:)");
		System.out.println("Connection Established");
		
		String insert_data = "insert into employee values(3,'Parth',67000),"
				+ "(4,'Akash',55000),(5,'Piyush',50000),(6,'Pratik',45000),"
				+ "(7,'Kunal',88000),(8,'Pratham',67000) ;";
		//String delete_data = "delete from employee where id = 3";
		System.out.println("Query Constructed");
		
		Statement smt = con.createStatement();
		System.out.println("Reference Created");
		
		smt.execute(insert_data);
		System.out.println("Query submitted");
		
		smt.close();
		con.close();
			
	}

}
