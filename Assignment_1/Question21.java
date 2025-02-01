package Assignment_1;

public class Question21{
    public static void main(String[] args) {
        System.out.println("The binary num of 10 is ");
        int[] binaryNum = new int[1000];
        int n = 10;
        int i = 0;
        while (n>0) 
        {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j=i-1;j>=0;j--)
        {
            System.out.print(binaryNum[j]);
        }
        System.out.println();
        System.out.println("The decimal of 111 is");
        int num= 111;
        int base = 1;
        int temp = num;
        int dec = 0;
        while(temp>0){
            int last_digit = temp%10;
            temp = temp/10;
            dec = dec + last_digit*base;
            base = base*2;
        }
        System.out.println(dec);
    }
}