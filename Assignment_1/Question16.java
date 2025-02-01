package Assignment_1;
import java.util.Scanner;

public class Question16{

    int HCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        Question16 q = new Question16();
        
        int hcf = q.HCF(num1, num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
}