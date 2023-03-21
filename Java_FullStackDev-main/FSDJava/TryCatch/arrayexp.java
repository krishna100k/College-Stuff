package TryCatch;

public class arrayexp {
	public static void main(String[] args) {
		System.out.println("Main start");
		try {
			System.out.println("Try start");
			int arr[] = {1,2,3,4};
			System.out.println(arr[4]);
			System.out.println("Try end");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index");
		}
		
		System.out.println("Main end");
	}

}
