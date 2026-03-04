package Assignments.Assignment2.Module4.Final;

//Demonstrate the use of final keyword with variables, methods, and classes.

public class FinalVariable {
    public static void main(String[] args) {
        final int speedLimit=60;

//        speedLimit=80;   cannot change the final variable

        System.out.println("The speed limit is: "+speedLimit);
    }
}
