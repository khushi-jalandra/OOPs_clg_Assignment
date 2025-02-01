package Assignment_2;

class Distance
{
    double distanceInMiles = 346.86;
    public void travelTime()
    {
        double speedInMph = 60.0;
        double timeInHours = distanceInMiles / speedInMph;
        System.out.println("Time taken to cover the distance in hrs "+ timeInHours);
    }
}

class DistanceMKS extends Distance
{   
    public void travelTime()
    {
        double speedInKps = 100.0;
        double distanceInKilometers = distanceInMiles / 0.621;
        double timeInSeconds = distanceInKilometers / speedInKps;
        System.out.println("Time taken to cover the distance in secs "+timeInSeconds);
    }
}        
public class Question12 {
    public static void main(String[] args) {
        Distance distanceMiles = new Distance();
        distanceMiles.travelTime();
        DistanceMKS distanceKilometers = new DistanceMKS();
        distanceKilometers.travelTime();
    }
}
