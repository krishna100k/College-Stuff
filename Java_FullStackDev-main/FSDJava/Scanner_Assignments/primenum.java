package Scanner_Assignments;
import java.util.*;


public class primenum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println("Number is not prime");
		}
		else 
		{
			System.out.println("Number is prime");
		}
		sc.close();
	}

}
