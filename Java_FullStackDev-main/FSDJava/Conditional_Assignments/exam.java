package Conditional_Assignments;
import java.util.*;

public class exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number of classes held: ");
        double classnum = sc.nextInt();

        System.out.println("Enter number of classes attended: ");
        double classat = sc.nextInt();

        double per = (classat/classnum)*100;
        System.out.println("Total attendance: "+per+" %");

        if(per>75.0){
            System.out.println("Student is allowed to appear for exam");
        }
        else{
            System.out.println("Student is not allowed to appear for exam");
        }
        sc.close();
    }
}
