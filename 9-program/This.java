public class This {

    public static class Demo {
        public void getName() {
            System.out.println("Escape the Matrix");
        }

        public void display() {
            this.getName();
        }

        public static void main(String[] args) {
            Demo d = new Demo();
            d.display();
        }
    }

}

///output Escape the Matrix