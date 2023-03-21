package Conditional_Assignments;
import java.util.*;

public class leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("Year is leap year");
        }
        else
        {
            System.out.println("Year is not a leap year");
        }
        sc.close();
    }
    
}
