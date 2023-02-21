import java.util.Scanner;

public class StringUppercase {

    public static void main(String[] args) {
        readUserInputAndPrintInUpperCase();
    }

    private static void readUserInputAndPrintInUpperCase() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write input String and press Enter:");
        String str = sc.nextLine();
        System.out.println("Input String in Upper Case = " + str.toUpperCase());
        sc.close();
    }
}

// output -:
//        Please write input String and press Enter:
//        kaushik rajput
//        Input String in Upper Case = KAUSHIK RAJPUT