package Assignments.Assignment2.Module4;

abstract class Shape {
    abstract void Area();
}
class Circle extends Shape {
    @Override
    void Area() {
        System.out.println("Area of circle is calculated");
    }
}
class Rectangle extends Shape{
    @Override
    void Area(){
        System.out.println("Area of rectangle is calculated");
    }
}
class Driver{
    public static void main(String[] args) {
        Shape c=new Circle();
        Shape r=new Rectangle();
        c.Area();
        r.Area();
    }
}