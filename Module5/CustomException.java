package Assignments.Assignment2.Module5;

public class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
class Driver{

    public static void age(int age) throws CustomException {
        if (age<18){
            throw new CustomException("Invalid age: Not allowed to vote");
        }
        else{
            System.out.println("Valide age:allowed to vote ");
        }
    }

    public static void main(String[] args) {
        try{
            age(13);
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }



}
