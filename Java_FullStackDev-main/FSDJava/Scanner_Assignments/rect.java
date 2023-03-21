package Scanner_Assignments;
import java.util.*;

public class rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter length of rectange: ");
        double len = sc.nextDouble();

        System.out.println("Enter breadth of rectangle: ");
        double bred = sc.nextDouble();

        double area = len*bred;
        int area1 = (int)area;

        System.out.println("Area is: "+area1);
        sc.close();
    }    
}
