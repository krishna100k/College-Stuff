package Scanner_Assignments;
import java.util.*;

public class stringinp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = sc.next();

        System.out.println("Enter second string: ");
        String str2 = sc.next();

        String finalstr = str1+str2;
        System.out.println("Final String is: ");
        System.out.println(finalstr);
        sc.close();
    }
}
