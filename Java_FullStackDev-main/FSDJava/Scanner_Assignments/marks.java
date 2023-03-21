package Scanner_Assignments;

import java.util.*;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hey Robert, enter your marks of all 3 subjects (out of 100): ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int tot = m1+m2+m3;
        double per = (tot/300.0)*100;

        System.out.println("Total Marks: "+tot);
        System.out.println("Total Percentage: "+per);


        sc.close();
    }
    
}
