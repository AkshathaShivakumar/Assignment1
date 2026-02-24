package Assignments.Assignment1.Module3;


/*
Write a program to demonstrate polymorphism using method overriding with a base
class Shape and derived classes Circle and Rectangle.
 */

class Shape {
    public void area() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void area() {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}

// Main class
public class Overriding {
    public static void main(String[] args) {

        Shape s1 = new Circle(5);
        Shape s2 = new Rectangle(4, 6);

        s1.area();
        s2.area();
    }
}
