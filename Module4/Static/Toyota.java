package Assignments.Assignment2.Module4.Static;

public class Toyota {
    static String color="white";
    String type;
    int speed;


    void start(){
        System.out.println("Engine Started!");
    }

    static void Stop(){
        System.out.println("Engine stopped");
    }
}

class Innova extends Toyota{
@Override
    void start(){
        System.out.println("Innova started");
    }

    public static void main(String[] args) {
        System.out.println("Default Innova color: "+Toyota.color);

        Innova car1=new Innova();
        Innova car2=new Innova();

        car1.color="Grey";

        System.out.println("Car1 color: "+car1.color);
        System.out.println("Car2 color: "+car1.color);
        System.out.println("Class level color: "+Toyota.color);

        car1.start();

        car2.Stop();
    }

}
