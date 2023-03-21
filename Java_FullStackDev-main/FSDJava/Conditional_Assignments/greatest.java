package Conditional_Assignments;
import java.util.*;

public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println("Value "+num1+" is greater");
        }
        else{
            System.out.println("Value "+num2+" is greater");
        }
        sc.close();
    }
    
}
