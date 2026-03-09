package Assignments.Assignment2.Module5;

public class DeadlockDemo {
    public static void main(String[] args) {

        final String resource1 = "Key 1";
        final String resource2 = "Key 2";


        Thread t1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Locked " + resource1);

                try { Thread.sleep(100); } catch (Exception e) {}

                System.out.println("Thread 1: Waiting for " + resource2 + "...");
                synchronized (resource2) {
                    System.out.println("Thread 1: Locked " + resource2);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Locked " + resource2);

                try { Thread.sleep(100); } catch (Exception e) {}

                System.out.println("Thread 2: Waiting for " + resource1 + "...");
                synchronized (resource1) {
                    System.out.println("Thread 2: Locked " + resource1);
                }
            }
        });

        t1.start();
        t2.start();
    }
}