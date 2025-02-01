package Assignment_1;

import java.util.Scanner ;

public class Question1 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the temp in faranheit");
        float f = sc.nextFloat();
        float c = (f-32)*(5/9);
        System.out.println("the temp in celcius : " + c);
        System.out.println("Enter the temp in celcius");
        float c1= sc.nextFloat();
        float f1 = (c1*(9/5))+32;
        System.out.println("temp in faranheit : "+f1);
 }
    }
