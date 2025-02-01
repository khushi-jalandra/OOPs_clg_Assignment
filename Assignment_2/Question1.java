package Assignment_2;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        int b[] = { 6,7,8,9};
        int l1 = a.length;
        int l2 = b.length;
        int c[] = new int[l1+l2];
        int i=0,k=0,j=0;
        while(i<l1)
        {
           c[k++]=a[i++];
        }
        while(j<l2)
        {
            c[k++]=b[j++];
        }
        Arrays.sort(c);

        for(i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}
