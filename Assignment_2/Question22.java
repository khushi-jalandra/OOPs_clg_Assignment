package Assignment_2;

class CustomArithmeticException extends Exception {
    public CustomArithmeticException(String message) {
        super(message);
    }
}
public class Question22 {

    public static int calculateEquation(int a, int b, int c) throws CustomArithmeticException
    {
        if (b == 0) {
            throw new CustomArithmeticException("Division by zero is not allowed.");
        }

        if (c > 0 && a > Integer.MAX_VALUE - c) {
            throw new CustomArithmeticException("Integer overflow occurred");
        }
        return (a + c) / b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0; 
        int c = Integer.MAX_VALUE;

        try
        {
            int result = calculateEquation(a, b, c);
            System.out.println("The result of the equation is: " + result);
        } catch (CustomArithmeticException e)
        {
            System.err.println("CustomArithmeticException: " + e);
        }
    }
}
