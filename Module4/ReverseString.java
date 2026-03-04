package Assignments.Assignment2.Module4;

/* Write a program to reverse a string using StringBuilder*/
public class ReverseString {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Reverse");
        System.out.println("The original string is: "+sb);
        System.out.println("The reversed string is: "+sb.reverse());
    }
}
