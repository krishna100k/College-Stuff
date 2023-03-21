package Scanner_Assignments;
import java.util.*;

public class squarenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sqr = num*num;
        System.out.println("Square of number is: "+sqr);
        
        sc.close();

    }
    
}
