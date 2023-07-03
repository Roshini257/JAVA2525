package src.main.java.Week3;

public class test {
    public static void main(String[] args) {
        try {
            validateAge(15); // Calling a method that throws a custom exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught InvalidAgeException: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Valid age: " + age);
    }
}

    class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }



