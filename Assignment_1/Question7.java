package Assignment_1;

import java.util.Scanner;

public class Question7 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage of the student :");
        float p = sc.nextFloat();
        if(p>=90) 
        System.out.println("Grade A");
        else if(p>=80) 
        System.out.println("Grade B");
        else if(p>=70 ) 
        System.out.println("Grade C");
        else if(p>=60) 
        System.out.println("Grade D");
        else if(p>=50) 
        System.out.println("Grade E");
        else 
        System.out.println("Grade F");
    }
}
