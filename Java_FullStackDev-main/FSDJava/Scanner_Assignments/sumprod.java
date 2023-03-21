package Scanner_Assignments;

import java.util.*;

public class sumprod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		int addn = num1+num2;
		int mult = num1*num2;
		
		System.out.println("Addition is: "+addn);
		System.out.println("Multiplication is: "+mult);
		sc.close();
	}
}
