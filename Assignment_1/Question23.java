package Assignment_1;

public class Question23{
    public static void main(String[] args) {
        int a=1;
        for (int i=1;i<=3;i++)
        {
            int temp=(2*i-1);
            for (int j=1;j<=temp;j++)
            {
                    System.out.print(a+" ");
                    ++a;
            }
            System.out.println();
        }
        for (int i=1;i<=4;i++)
        {
            int k=i;
            for (int j=1;j<=7;j++)
            {
                if(j<=4-i || j>=4+i)
                {
                    System.out.print(" ");
                }
                else
                {
                    if(k<=i)
                    {
                        if(k==0)
                        {
                            k=2;
                            while(k<=i)
                            {
                                System.out.print(k);
                                k++;
                            }
                            break;
                        }
                        System.out.print(k);
                        k--;
                    }
                }
            }
            System.out.println();
        }
    }
}