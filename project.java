import java.util.Scanner;
public class project {
    private static final String USERNAME = "Aishwaryae";
    private static final String PASSWORD = "pass123";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isAuthenticated = false;
        while (!isAuthenticated) {
            System.out.print("Enter username: ");
            String enteredUsername = scanner.nextLine();
            System.out.print("Enter password: ");
            String enteredPassword = scanner.nextLine();

            if (USERNAME.equals(enteredUsername) && PASSWORD.equals(enteredPassword)) {
                isAuthenticated = true;
            } else {
                System.out.println("Invalid username or password. Please try again.");
            }
        }
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        int length = password.length();
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        for (int i = 0; i < length; i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }
        int strengthScore = 0;
        if (length >= 8) {
            strengthScore++;
        }
        if (hasUpperCase && hasLowerCase) {
            strengthScore++;
        }
        if (hasDigit) {
            strengthScore++;
        }
        if (hasSpecialChar) {
            strengthScore++;
        }
        String strength;
        strength = switch (strengthScore) {
            case 0, 1 -> "Very Weak";
            case 2 -> "Weak";
            case 3 -> "Moderate";
            case 4 -> "Strong";
            default -> "Very Strong";
        };
        System.out.println("Password Strength: " + strength);
        scanner.close();
    }
}
