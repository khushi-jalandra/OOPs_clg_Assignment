package Assignment_2;

class Num 
{
    int number=200;
    public void shownum()
    {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num 
{

    public void shownum()
    {
        System.out.println("Number: " + number);
        System.out.println("Hexadecimal: " + Integer.toHexString(number).toUpperCase());
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}
public class Question11 {
    public static void main(String[] args) {
        Num num = new Num();
        num.shownum();
        HexNum hexNum = new HexNum();
        hexNum.shownum();
    }
}
