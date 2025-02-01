package Assignment_1;

public class Question19{
    public static void main(String[] args) {
        int num= 3489,rev=0,n;
        int temp = num;
        while(num!=0)
        {
            n = num%10;
            rev = (rev*10) + n;
            num=num/10; 
        }
        if(temp==rev)
        {
            System.out.println("the number is palindrom");
        }
        else
        {
            System.out.println("the number is not palindrom");
        }
    }
}