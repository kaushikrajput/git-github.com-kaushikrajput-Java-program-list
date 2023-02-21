import java.util.Scanner;

public class ComplexNumber {

    public class GfG {
        public static String complexNumberMultiply(String a, String b) {

            String x[] = a.split("\\+|i");
            String y[] = b.split("\\+|i");

            // Storing the real part of complex string a
            int a_real = Integer.parseInt(x[0]);

            // Storing the imaginary part of complex string a
            int a_img = Integer.parseInt(x[1]);

            // Storing the real part of complex string b
            int b_real = Integer.parseInt(y[0]);

            // Storing the imaginary part of complex string b
            int b_img = Integer.parseInt(y[1]);

            // Returns the product.
            return (a_real * b_real - a_img * b_img) + "+" +
                    (a_real * b_img + a_img * b_real) + "i";
        }

        // Driver function
        public static void main(String argc[]) {
            try (Scanner sc = new Scanner(System.in)) {
                String str1, str2;
                System.out.println("Enter first complex number");
                str1 = sc.nextLine();
                System.out.println("Enter second complex number");
                str2 = sc.nextLine();
                System.out.println(complexNumberMultiply(str1, str2));
            }
        }
    }

}

//output :-
// Enter first complex number
// 2+2i
// Enter second complex number
// 1+2i
// -2+6i