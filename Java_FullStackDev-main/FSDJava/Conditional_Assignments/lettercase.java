package Conditional_Assignments;

import java.util.*;

public class lettercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any letter: ");
        char letter = sc.next().charAt(0);

        if(letter>=65 && letter<=90){
            System.out.println("Letter is uppercase");
        }
        else if(letter>=97 && letter<=122){
            System.out.println("Letter is lowercase");
        }
        sc.close();
    }    
}
