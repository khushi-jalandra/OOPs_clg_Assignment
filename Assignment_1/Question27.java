package Assignment_1;

import java.util.Scanner;

public class Question27 {
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
        int min=ar[0];
        for(int i=0;i<n;i++)
        {
            if(ar[i]<min)
            {
                min=ar[i];
            }
        }
        System.out.println("smallest element of the array is "+ min);
    }
}
