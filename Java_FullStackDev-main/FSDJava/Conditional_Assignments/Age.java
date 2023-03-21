package Conditional_Assignments;
import java.util.*;

public class Age {
	main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Eligible for voting");
        }
        else{
            System.out.println("Not eligibe for voting");
        }
        sc.close();
    }
    
}
