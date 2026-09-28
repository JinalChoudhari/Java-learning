package exceptionhandling;
import java.util.Scanner;

class AgeNotValidException extends Exception {

    public AgeNotValidException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    static void checkAge(int age) throws AgeNotValidException {

        if (age < 18) {
            throw new AgeNotValidException("You must be 18 or above to vote.");
        }

        System.out.println("You are eligible to vote.");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);
        } catch (AgeNotValidException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
