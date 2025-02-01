package Assignment_1;

public class Question11 {
    public static void main(String[] args) {
        int num= 3489,rev=0,n;
        while(num!=0)
        {
            n = num%10;
            rev = (rev*10) + n;
            num=num/10; 
        }
        System.out.println(rev);
    }
}
