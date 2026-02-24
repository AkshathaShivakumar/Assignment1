package Assignments.Assignment1.Module3;

/*
 Write a program to demonstrate single inheritance with a base class Animal and
derived class Dog.
 */
public class Animal {
    void eat(){
        System.out.println("Animal eats food");
    }
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    void sound(){
        super.sound();
        System.out.println("Dog barks");
    }
}
class SingleInheritance{
    public static void main(String[] args) {
    Animal dog=new Dog();
    dog.eat();
    dog.sound();

    }
}

