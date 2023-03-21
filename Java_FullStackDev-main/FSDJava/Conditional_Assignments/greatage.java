package Conditional_Assignments;
import java.util.*;

public class greatage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age of 1st person: ");
        int age1 = sc.nextInt();

        System.out.println("Enter age of 2nd person: ");
        int age2 = sc.nextInt();

        System.out.println("Enter age of 3rd person: ");
        int age3 = sc.nextInt();

        if(age1>age2 && age1>age3){
            System.out.println("Person 1 is oldest");
            if(age2>age3){
                System.out.println("Person 3 is youngest");
            }
            else{
                System.out.println("Person 2 is youngest");
            }
        }
        sc.close();
    }
    
}
