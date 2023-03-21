package Lists;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class revlist {
	public static void main(String[] args) {
		List<Integer> rn = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers in list: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		rn.add(num1);
		rn.add(num2);
		rn.add(num3);
		
		rn.forEach((s)->System.out.println(s));
		
		
		System.out.println("Reversed list is: ");
		rn.add(num3);
		rn.add(num2);
		rn.add(num1);
		
		rn.forEach((s)->System.out.println(s));
		
	}

}
