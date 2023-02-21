import java.util.Scanner;
import java.lang.Math;

public class FinalKeyword {
    public static void main(String[] args) {
        final double radius, circumference, area;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the radius of the circle: ");
            radius = sc.nextDouble();
            area = (Math.PI * (radius * radius));
            System.out.print("Area of the circle is: " + area);

            circumference = (2 * Math.PI * radius);
            System.out.print("\nCircumference of the circle: " + circumference);
        }
    }

}

//output  :-
//           Enter the radius of the circle: 10
//           Area of the circle is: 314.1592653589793      
//           Circumference of the circle: 62.83185307179586