package Assignments.Assignment2.Module5.Threads.UsingThreadClass;

public class Demo extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
        System.out.println("Child Thread "+i+" is running");
        }
    }
}
class Driver{
    public static void main(String[] args) {
        Demo d=new Demo();
        d.start();

    }
}
