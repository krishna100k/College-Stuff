package TryCatch;

public class finallyblock {
	public static void main(String[] args) {
		System.out.println("Main start");
		try {
			System.out.println("Try start");
			int a = 10/10;
			System.out.println(a);
			System.out.println("Try end");
		}
		catch(ArithmeticException e) {
			System.out.println("Enter non-zero value");
		}
		finally {
			System.out.println("Finally block");
		}
		
		System.out.println("Main end");
	}

}
