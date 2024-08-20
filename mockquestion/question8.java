package mockquestion;
import java.util.Scanner;
import java.util.regex.Pattern;
public class question8 {
    public static void main(String[] args) {
        // question 8
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a valid email address: ");
        String email = scanner.nextLine();
        try {
            validateEmail(email);
            System.out.println("Valid email: " + email);
        } catch (InvalidEmailException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void validateEmail(String email) throws InvalidEmailException {
        String emailRegex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        if (!Pattern.matches(emailRegex, email)) {
            throw new InvalidEmailException("Invalid email address.");
        }
    }
    
}
class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}
