package Assignment_1;

import java.util.Arrays;

public class Question22{
    public static void main(String[] args) {
        int Median1 =0 ;
        int Median2 = 0;
        int m1[] ={44,31,6};
        int m2[] = {12,33,2,11,45,3};
        Arrays.sort(m1);
        Arrays.sort(m2);
        if((m1.length)%2!=0)
        {
            Median1 = m1[Math.floorDiv(m1.length,2)];
        }
        System.out.println("The median is :"+Median1);
        if((m2.length)%2==0)
        {
            Median2 = m2[(Math.floorDiv(m2.length,2)+(Math.floorDiv(m2.length,2)+1))/2];
        }
        System.out.println("The median is :"+Median2); 
    }
}