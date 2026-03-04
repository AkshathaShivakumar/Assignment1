package Assignments.Assignment2.Module5;

public class ThreadStateDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            try {
                // Moving to TIMED_WAITING
                Thread.sleep(200); 
                
                // Moving to WAITING (waiting for another thread)
                synchronized (ThreadStateDemo.class) {
                    ThreadStateDemo.class.wait(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("State after creation: " + thread1.getState());

        thread1.start();

        System.out.println("State after calling start(): " + thread1.getState());

        Thread.sleep(100); 
        System.out.println("State during sleep(): " + thread1.getState());

        thread1.join();

        System.out.println("State after completion: " + thread1.getState());
    }
}