package Assignment_1;

import java.util.Scanner;
class marks{
    int p , c , m , total;
    void setmarks( int physics , int chem, int math)
    {
        p = physics;
        c = chem;
        m = math;
        total = p+c+m;
    }

     String getMarks()
     {
        if((p>=50)&&(c>=40)&&(m>=60)&&(total>=200))
        {
            return "Eligible";
        }
        else if ((m+p>=150))
        {
            return "Eligible";
        }
        else
        {
            return "Not Eligible";
        }

    }
 }

public class Question12 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter physics marks");
        int p = sc.nextInt();
        System.out.println("Enter chemistry marks");
        int c = sc.nextInt();
        System.out.println("Enter math marks");
        int m = sc.nextInt();

        marks m1 = new marks();
        m1.setmarks(p,c,m);
        String e = m1.getMarks();
        System.out.println("eligible or not : "+e);
}
}
