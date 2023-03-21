package Conditional_Assignments;
import java.util.*;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length: ");
        int len = sc.nextInt();

        System.out.println("Enter breadth: ");
        int bred = sc.nextInt();

        if(len==bred){
            System.out.println("Quadrilateral is square");
        }
        else{
            System.out.println("Quadrilateral is not sqaure");
        }
        
        sc.close();
    }
}
