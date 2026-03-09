package Assignments.Assignment1.Module1;
import java.util.*;

// Write a program to check if a given number is positive, negative, or zero.
public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int a=sc.nextInt();

        if(a==0){
            System.out.println(a +"is zero.");
        } else if (a<0) {
            System.out.println(a+" is negative number");
        }
        else if(a>0){
            System.out.println(a+" is positive number");
        }
    }
}
