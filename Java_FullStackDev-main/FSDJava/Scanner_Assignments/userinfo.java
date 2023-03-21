package Scanner_Assignments;

import java.util.*;

public class userinfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter name: ");
		String name = sc.next();
		
		System.out.println("Enter roll number: ");
		int roln = sc.nextInt();
		
		System.out.println("Enter field of interest: ");
		String foi = sc.next();
		
		System.out.println("Hey, my name is "+name+" and my roll number is "+roln+". My field of interest is "+foi);
		sc.close();
	}

}
