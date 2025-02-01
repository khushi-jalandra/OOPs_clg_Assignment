package Assignment_1;

public class Question18{
    public static void main(String[] args) {
        int num=75345;
        int n=0;
        while(num!=0)
        {
            num=num/10;
            n++; 
        }
        System.out.println("the number of digits in the given number "+n);
    }
}