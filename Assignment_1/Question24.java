package Assignment_1;

public class Question24{
    public static void main(String[] args) {
        int a[]={24,3,35,56,12,65,4};
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        System.out.println("sum of the integer array is " + sum);
        float average=(float)sum/a.length;
        System.out.println("average of the integer array is " + average);
    }
}