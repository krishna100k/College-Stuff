package Scanner_Assignments;
import java.util.*;

public class summethod {

    public void getTotal(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();

        int total = num1+num2;
        System.out.println("Sum is: "+total);

        sc.close();
    }

    public static void main(String[] args) {
       summethod met1 = new summethod();
       met1.getTotal();
    }
}
