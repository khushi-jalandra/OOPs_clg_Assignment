package Assignment_2;

public class Question20 {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        try
        {
            int size = -5;
            int[] array = new int[size];
        }
        catch (NegativeArraySizeException e)
        {
            System.err.println("Caught NegativeArraySizeException: " + e);
        }
        try
        {
            int a = 10;
            int b = 0;
            int result = a / b;
        }
        catch (ArithmeticException e)
        {
            System.err.println("Caught ArithmeticException: " + e);
        }
        finally
        {
            System.out.println("Program continues after exception handling.");
        }
    }
}
