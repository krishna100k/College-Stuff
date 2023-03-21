package Basic;

import java.util.*;

public class result {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Marks: ");
		int m1 = sc.nextInt();
		
		if(m1<40) {
			System.out.println("Fail");
		}
		
		else if(m1>=40 && m1<60) {
			System.out.println("Pass");
		}
		
		else if(m1>=60 && m1<80) {
			System.out.println("B");
		}
		
		else {
			System.out.println("A");
		}
		sc.close();

		}
	}
