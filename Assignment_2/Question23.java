package Assignment_2;

class TooHotException extends Exception {
    public TooHotException(String message) {
        super(message);
    }
}
class TooColdException extends Exception {
    public TooColdException(String message) {
        super(message);
    }
}

public class Question23 {
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("provide a temperature in Celsius on command line");
            return;
        }

        try 
        {
            double temperature = Double.parseDouble(args[0]);

            if (temperature > 35)
            {
                throw new TooHotException("too hot!");
            }
            else if (temperature < 5)
            {
                throw new TooColdException("too cold!");
            }
            else
            {
                double fahrenheit = (temperature * 9/5) + 32;
                System.out.println("Normal temperature. Fahrenheit: " + fahrenheit);
            }
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid input. Please enter a valid number.");
        }
        catch (TooHotException | TooColdException e)
        {
            System.out.println(e.getMessage());
        }
    }
}