package ScannerClass;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//integer
		System.out.println("Enter any number: ");
		int num = sc.nextInt();
		System.out.println("Number is: "+num);
		
		//string
		System.out.println("Enter your name: ");
		String str = sc.next();
		System.out.println("Name is: "+str);
		
		//float
		System.out.println("Enter number in float: ");
		float flt = sc.nextFloat();
		System.out.println("Number is: "+flt);
		
		//double 
		System.out.println("Enter number(double): ");
		double dbl = sc.nextDouble();
		System.out.println("Number is(double): "+dbl);
		
		//long
		System.out.println("Enter number(long): ");
		long lng = sc.nextLong();
		System.out.println("Number is(long): "+lng);
	}

}
