package Assignment_1;

import java.util.Scanner;

public class Question15 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of which table you want");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
