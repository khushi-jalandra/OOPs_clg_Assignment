package Assignment_1;

import java.util.Scanner;

public class Question17{

    int HCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    int LCM(int a, int b, int hcf) {
        return (a * b) / hcf;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        Question17 q = new Question17();
        
        int hcf = q.HCF(num1, num2);

        int lcm = q.LCM(num1, num2, hcf);

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
}