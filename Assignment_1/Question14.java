package Assignment_1;

import java.util.Scanner;

public class Question14 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the start of interval");
        int f = sc.nextInt();
        System.out.println("enter the end of interval");
        int e = sc.nextInt();
        for(int i=f;i<=e;i++)
        {
            if(i%10==0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
