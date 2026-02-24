package Assignments.Assignment1.Module2;


import java.util.Scanner;

//Write a program with a method that checks whether a given string is a palindrome.
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a String: ");
        String str= sc.nextLine();

        if (isPalindrome(str)) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a Palindrome String");
        }

    }
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
