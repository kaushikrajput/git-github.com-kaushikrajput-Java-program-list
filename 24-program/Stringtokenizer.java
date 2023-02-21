import java.util.Scanner;
import java.util.StringTokenizer;

public class Stringtokenizer {

    public static class WordsInAString {
        String str;

        public WordsInAString(String str) {
            this.str = str;
        }

        public void stringLength() {
            if (str.isEmpty() || str == null) {
                System.out.println("There are no words in the sentence.\n");
            } else {
                StringTokenizer words = new StringTokenizer(str); // StringTokenizer class object is created
                int length = words.countTokens(); // countTokens() method counts the number of words
                System.out.println("There are " + length + " words in the Sentence."); // print the length
            }
        }
    }

    static class Test {
        public static void main(String args[]) {
            try (Scanner s = new Scanner(System.in)) {
                String input;
                System.out.println("\nEnter a String.");
                input = s.nextLine();
                WordsInAString w = new WordsInAString(input);
                w.stringLength();
            }
        }
    }
}

// output :-
//        Enter a String.
//        thats what she said
//        There are 4 words in the Sentence.