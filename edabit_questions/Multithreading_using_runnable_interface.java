package edabit_questions;

public class Multithreading_using_runnable_interface {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i <n ; i++) {
            Thread obj = new Thread(new Demo());
            obj.start();
        }
    }
}

class Demo implements Runnable {

    @Override
    public void run() {

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
