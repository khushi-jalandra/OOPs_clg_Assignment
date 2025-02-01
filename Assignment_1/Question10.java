package Assignment_1;

import java.util.Scanner;

public class Question10 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =0,b=1,c;
        System.out.println("enter the length of fabonacci series");
        int len = sc.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=0;i<len;i++)
        {
            c = a;
            a = b;
            b = c+b;
            System.out.print(b+" ");
        }
    }
}
