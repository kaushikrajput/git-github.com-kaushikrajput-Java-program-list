public class Overriding {

    static class Parent {
        void show() {
            System.out.println("parent class method");
        }

       static class Child extends Parent {
            void show() {
                super.show();
                System.out.println("child class method");
            }

            public static void main(String args[]) {
                Parent ob = new Child();
                ob.show();
            }
        }
    }
}

//output parent class method
//       child class method