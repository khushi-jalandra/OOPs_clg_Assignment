package Assignment_1;

import java.util.Scanner;

public class Question28 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int ar[]=new int [n];
        System.out.println("enter "+ n + " elements");
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(ar[i]%2==0)
            {
                continue;
            }
            else
            {
                sum=sum+ar[i];
            }
        }
        System.out.println("Sum of all the odd numbers in the array is "+ sum);
    }
}
