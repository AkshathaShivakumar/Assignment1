package Assignments.Assignment2.Module5.Threads.UsingRunnableInterface;

class Demo implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is running");
    }
}
class Driver {
    public static void main(String[] args) {
        Demo d=new Demo();
        Thread obj=new Thread(d);
        obj.start();
    }
}
