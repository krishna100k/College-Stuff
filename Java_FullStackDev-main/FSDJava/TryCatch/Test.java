package TryCatch;

public class Test {
	public static void main(String[] args) {
		System.out.println("Main start");
		try {
			System.out.println("Try start");
		int a= 10;
		int b= 0;
		int c=a/b;
		System.out.println(c);
		System.out.println("Try end");
		}
		catch(ArithmeticException e) {
			System.out.println("Enter non zero value");
		}
		
		System.out.println("Main end");
	}

}
