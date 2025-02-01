package Assignment_2;

import java.util.Scanner;

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class Question26 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try
        {
            if (age < 0)
            {
                throw new NegativeAgeException("Age cannot be negative.");
            } else
            {
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
            }
        } catch (NegativeAgeException e)
        {
            System.out.println(e.getMessage());

        }
    }
}
