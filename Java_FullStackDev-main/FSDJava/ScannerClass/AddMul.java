package ScannerClass;

import java.util.*;

public class AddMul {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//take inputs 
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second number: ");
		int num2 = sc.nextInt();
		
		int add = num1+num2;
		int mul = num1*num2;
		
		System.out.println("Addition is: "+add);
		System.out.println("Multiplication is: "+mul);
		
	}

}
