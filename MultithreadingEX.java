 public class MultithreadingEX {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            Example demo = new Example();
            demo.start();
        }
    }
}class Example extends Thread {
    public void run(){
        try {
            // Displaying the thread that is running
            System.out.println(
                    "Thread " + Thread.currentThread().getId()
                            + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
