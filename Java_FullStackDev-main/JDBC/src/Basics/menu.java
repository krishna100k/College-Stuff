package Basics;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class menu {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		//System.out.println("Driver Class loaded");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","jay4757:)");
		//System.out.println("Connection Established");
		
		
		int opt = 0;
		while(opt!=4) {
		
		System.out.println("\nChoose an option:");
        System.out.println("1. Insert");
        System.out.println("2. Display");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Exit");
        
        opt = sc.nextInt();
        
        Statement smt = con.createStatement();
        
        switch(opt) {
        case 1:
        	System.out.println("Enter employee id: ");
        	int id = sc.nextInt();
        	
        	System.out.println("Enter employee name: ");
        	String name = sc.next();
        	
        	System.out.println("Enter employee salary: ");
        	double salary = sc.nextDouble();
        	
        	String insert_data = "insert into employee values ("+id+",'"+name+"',"+salary+")";
        	//System.out.println("Query Constructed");
        	
        	
    		//System.out.println("Reference Created");
    		
    		smt.execute(insert_data);
    		System.out.println("Record added successfully");
    		break;
    	
        case 2:
        	System.out.println("Employee database: ");
        	String display_data = "select * from employee";
        	smt.execute(display_data);
        	break;
    		
        case 3:
        	System.out.println("Enter employee id for updation: ");
        	int upid = sc.nextInt();
        	
//        	System.out.println("Enter updated name: ");
//        	String upname = sc.next();
        	
        	System.out.println("Enter amount to be updated: ");
        	double upamt = sc.nextDouble();
        	
        	String update_data = "update employee set salary = "+upamt+"where id= "+upid;
        	smt.execute(update_data);
        	System.out.println("Changes made successfully");
        	break;
        	
        
        case 4:
        	System.out.println("Enter employee id to delete record: ");
        	int delid = sc.nextInt();
        	
        	String del_data = "delete from employee where id= "+delid;
        	smt.execute(del_data);
        	System.out.println("Record deleted successfully");
        	break;
        	
        case 5:
        	System.out.println("Bye");
        	break;
        
        default:
        	System.out.println("Invalid choice");
        			
        }//switch
     }//while
}//main
}//class
