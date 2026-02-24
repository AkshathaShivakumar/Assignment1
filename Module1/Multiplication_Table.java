package Assignments.Assignment1.Module1;
import java.util.*;


//Write a program to print the multiplication table of a given number using a for loop.
public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        for (int i = 0; i <=20; i++) {
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
