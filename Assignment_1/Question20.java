package Assignment_1;

import java.util.Scanner;

public class Question20{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any number");
        int n = sc.nextInt();
        int count =0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
        {
            System.out.println("the number is prime");
        }
        else
        {
            System.out.println("number is not prime");
        }
    }
}