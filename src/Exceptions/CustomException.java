package Exceptions;

public class CustomException {
    public static void main(String[] args) {
        //Checked custom exception
        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        //Unchecked custom exception
        deposit(-10);
    }

    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be >= 18");
        }
    }
    static void deposit(int amount) {
        if (amount <= 0) {
            throw new InvalidAmountException("Amount must be positive");
        }
    }

}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class InvalidAmountException extends RuntimeException {
    public InvalidAmountException(String msg) {
        super(msg);
    }
}
