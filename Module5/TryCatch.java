package Assignments.Assignment2.Module5;

public class TryCatch {
    public static void main(String[] args) {
        int i,j,k;
        i=80;
        j=0;

        try{
            k=i/j;
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by Zero");
        }

    }
}
