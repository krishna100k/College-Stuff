package TryCatch;

public class strexp {
	public static void main(String[] args) {
		System.out.println("Main start");
		try {
			System.out.println("Try start");
			String str = null;
			System.out.println(str.length());
			System.out.println("Try end");
		}
		catch(NullPointerException e) {
			System.out.println("Invalid string");
		}
		System.out.println("Main end");
	}

}
