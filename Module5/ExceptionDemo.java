package Assignments.Assignment2.Module5;

import java.io.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        }

        try {
            FileReader file = new FileReader("non_existent_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}
