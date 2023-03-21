package Scanner_Assignments;
import java.util.*;

public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of variable 'a': ");
        int a = sc.nextInt();

        System.out.println("Enter value of variable 'b': ");
        int b = sc.nextInt();

        if(a<50 && a<b){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}
