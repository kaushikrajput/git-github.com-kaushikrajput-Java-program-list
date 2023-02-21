public class Super {
    static class Parentclass {
        // Overridden method
        void display() {
            System.out.println("Parent class method");
        }
    }

    static class Subclass extends Parentclass {
        // Overriding method
        void display() {
            System.out.println("Child class method");
        }

        void printMsg() {
            // This would call Overriding method
            display();
            // This would call Overridden method
            super.display();
        }

        public static void main(String args[]) {
            Subclass obj = new Subclass();
            obj.printMsg();
        }
    }

}

//output Child class method
//       Parent class method