package Assignment_2;


class NegativeNumberException extends Exception
{
    NegativeNumberException(String message)
    {
        super(message);
    }
}
public class Question19{
    public static void check(int number) throws NegativeNumberException
        {
            if (number < 0){
                throw new NegativeNumberException("The number " + number + " is negative.");
            }
            System.out.println("The number " + number + " is positive");
        }
    public static void main(String[] args) {
        int[] numbers = {10, -5, 3, -1, 7, 8};

        for (int number : numbers)
        {
            try {
            check(number);
            }
            catch (NegativeNumberException e)
            {
                System.out.println("Number is negative");
            }
            finally
            {
                System.out.println("finally block is executing");
            }
        }
    }
}
