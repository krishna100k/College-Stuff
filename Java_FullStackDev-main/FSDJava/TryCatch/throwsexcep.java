package TryCatch;

public class throwsexcep {
	public void m1() throws ArithmeticException{
		System.out.println("M1 start");
		
		int a = 10/0;
		System.out.println(a);
	}
	
	public void m2() throws ArrayIndexOutOfBoundsException{
		
	}

}
