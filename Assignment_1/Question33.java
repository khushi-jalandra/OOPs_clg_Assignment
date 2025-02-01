package Assignment_1;

import java.util.Scanner;

class Commission
{
    double sales;
    Commission(double sal)
    {
        sales = sal;
    }
    double commission()
    {
        return 0.25*sales;//assume 25% commission
    }
}

public class Question33 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sales");
        double sal = sc.nextDouble();
        if(sal<0)
        {
            System.out.println("Invalid input....");
        }
        else
        {
            Commission c = new Commission(sal);
            double commission = c.commission();
            System.out.println("comission in the sales is "+ commission);
        }
    }
}
