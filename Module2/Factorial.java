package Assignments.Assignment1.Module2;


import java.util.Scanner;

/*
Write a program with a method that calculates the factorial of a number using
recursion.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number: ");
        int num= sc.nextInt();
        System.out.println(fact(num));
    }
    public static int fact(int num){
        if(num==1){
            return 1;
        }
        return num*fact(num-1);
    }
}
