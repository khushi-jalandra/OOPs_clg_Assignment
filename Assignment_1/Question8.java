package Assignment_1;

import java.util.Scanner;

public class Question8 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        int num1=68;
        System.out.println("enter a number by which you want to divide the random number");
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        if(num1%num2 == 0)
        {
            System.out.println("the number is divisible by the number given by user");
        }
        else
        {
            System.out.println("the number is not divisible by the number given by user");   
        }
    }
}
