import java.util.*;  

public class Swapping {
    class Swap_With {
        public static void main(String[] args) {
            int x, y, t;// x and y are to swap
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter the value of X and Y");
                x = sc.nextInt();
                y = sc.nextInt();
            }
            System.out.println("before swapping numbers: " + x + "  " + y);
            /* swapping */
            t = x;
            x = y;
            y = t;
            System.out.println("After swapping: " + x + "   " + y);
            System.out.println();
        }
    }
}
 //output Enter the value of X and Y
//  2
//  4
//  before swapping numbers: 2  4
//  After swapping: 4   2     