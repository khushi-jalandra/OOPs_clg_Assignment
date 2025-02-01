package Assignment_2;

import java.util.Scanner;

class InvalidUsernameException extends Exception {
    public InvalidUsernameException(String message) {
        super(message);
    }
}

class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}

public class Question25 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enterpassword: ");
        String password = sc.nextLine();


        try {
            if (username.length() < 6) {
                throw new InvalidUsernameException("Username must be at least 6 characters long.");
            }

            if (!password.equals("password123")) {
                throw new InvalidPasswordException("Invalid password.");
            }
        } catch (InvalidUsernameException | InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
