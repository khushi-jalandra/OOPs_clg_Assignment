package Assignment_2;

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class Question21 {

    public static String findCapital(String country) throws NoMatchFoundException
    {
        String capital;
        if (country.equalsIgnoreCase("India"))
        {
            capital = "New Delhi";
        }
        else if (country.equalsIgnoreCase("Germany"))
        {
            capital = "Berlin";
        }
        else if (country.equalsIgnoreCase("France"))
        {
            capital = "Paris";
        }
        else if (country.equalsIgnoreCase("USA"))
        {
            capital = "Washington, D.C.";
        }
        else if (country.equalsIgnoreCase("Australia"))
        {
            capital = "Canberra";
        }
        else
        {
            throw new NoMatchFoundException("No capital found for country: " + country);
        }

        return capital;
    }
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please give a country name on a command line");
            return;
        }
        String country = args[0];
        try {
            String capital = findCapital(country);
            System.out.println("The capital of " + country + " is " + capital + ".");
        } catch (NoMatchFoundException e) {
            System.err.println("NoMatchFoundException: " + e);
        }
    }
}
