package mockquestion;


import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        // question 7
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string (5-20 characters): ");
        String input = scanner.nextLine();

        try {
            checkStringLength(input);
            System.out.println("Valid string: " + input);
        } catch (InvalidStringLengthException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void checkStringLength(String str) throws InvalidStringLengthException {
        if (str.length() < 5 || str.length() > 20) {
            throw new InvalidStringLengthException("String length must be between 5 and 20 characters.");
        }
    }
}

class InvalidStringLengthException extends Exception {
    public InvalidStringLengthException(String message) {
        super(message);
    }
}
