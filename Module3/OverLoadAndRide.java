package Assignments.Assignment1.Module3;

class Calculator{
    public int add(int a,int b){
       return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }
}

class Ani{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dogo extends Ani{
    void sound(){
        System.out.println("Dog Barks");
    }
}

public class OverLoadAndRide {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println(cal.add(3,4));
        System.out.println(cal.add(8.9,4.90));

        Ani a1=new Dogo();
        a1.sound();
    }
}
