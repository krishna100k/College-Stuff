package Basics;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class student {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Class loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","jay4757:)");
		System.out.println("Connection Established");
		
		//String insert_data = "insert into studinfo values(4,'Mary','Nagpur');";
		String delete_data = "delete from studinfo where id = 4";
		System.out.println("Query Constructed");
		
		Statement smt = con.createStatement();
		System.out.println("Reference Created");
		
		smt.execute(delete_data);
		System.out.println("Query submitted");
		
		smt.close();
		con.close();
			
	}

}
