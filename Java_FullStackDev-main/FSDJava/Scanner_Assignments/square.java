package Scanner_Assignments;
import java.util.*;

public class square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter side of square: ");
         int side = sc.nextInt();

         int peri = 4*side;
         int area = side*side;

         System.out.println("Perimeter of square is: "+peri);
         System.out.println("Area of square is: "+area);
         
         sc.close();

    }

}
