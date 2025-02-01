package Assignment_2;

import java.util.Scanner;

public class Question17 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum =0,rem;
        while(n>=10)
        {
            rem=n%100;
            sum =sum +rem;
            n=n/10;
        }
        System.out.println("The sum of numbers formed by consecutive digits is: " + sum);
    }
}
