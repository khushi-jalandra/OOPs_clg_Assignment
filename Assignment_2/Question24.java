package Assignment_2;

import java.util.Scanner;

class TooOlderException extends Exception{
    public TooOlderException(String message){
        super(message);
    }
}
class TooYoungerException extends Exception{
    public TooYoungerException(String message){
        super(message);
    }
}

public class Question24 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter candidate's name: ");
        String name = sc.nextLine();

        System.out.print("Enter candidate's age: ");
        int age = sc.nextInt();

        try {
            if (age > 45)
            {
                throw new TooOlderException("too old!");
            }
            else if (age < 20)
            {
                throw new TooYoungerException("too young!");
            }
            else
            {
                System.out.println("Eligible: " + name);
            }
        } catch (TooOlderException | TooYoungerException e) {
            System.out.println(e.getMessage());
        }
    }
}
