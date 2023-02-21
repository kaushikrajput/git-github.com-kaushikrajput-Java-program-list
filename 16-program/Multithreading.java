public class Multithreading {
    // Java code for thread creation by extending
    // the Thread class
    public static class MultithreadingDemo extends Thread {
        public void run() {
            try {
                // Displaying the thread that is running
                System.out.println(
                        "Thread " + Thread.currentThread().getId()
                                + " is running");
            } catch (Exception e) {
                // Throwing an exception
                System.out.println("Exception is caught");
            }
        }
    }

    // Main Class
    static class Multithread {
        public static void main(String[] args) {
            int n = 8; // Number of threads
            for (int i = 0; i < n; i++) {
                MultithreadingDemo object = new MultithreadingDemo();
                object.start();
            }
        }
    }

}

//output :- 
// Thread 14 is running
// Thread 16 is running
// Thread 19 is running
// Thread 20 is running
// Thread 15 is running
// Thread 17 is running
// Thread 18 is running
// Thread 21 is running
