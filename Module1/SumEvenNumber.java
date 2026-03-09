package Assignments.Assignment1.Module1;

/*
Write a program to find the sum of all even numbers between 1 and 100 using a while
loop.
 */
public class SumEvenNumber {
    public static void main(String[] args) {
        int sum=0;
        int num=1;
        while(num<=100){
            if(num%2==0){
                sum+=num;
            }
                num++;
        }
        System.out.println("Sum of even numbers between 1 to 100: "+sum);
    }
}
