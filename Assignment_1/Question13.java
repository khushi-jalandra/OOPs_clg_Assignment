package Assignment_1;

import java.util.Scanner;

public class Question13 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the natural number upto which you want to add");
        int len = sc.nextInt();
        int sum=0;
        for(int i=1;i<=len;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
