package Assignment_2;

class Vehicle {
    String regnNumber;
    double speed;
    String color;
    String ownerName;
    Vehicle(String regnNumber, double speed, String color, String ownerName)
    {
        this.regnNumber = regnNumber;
        this.speed = speed;
        this.color = color;
        this.ownerName = ownerName;
    }

    public void showData()
    {
        System.out.println("This is a vehicle class.");
    }
}

class Bus extends Vehicle
{
    private String routeNumber;
    Bus(String regnNumber, double speed, String color, String ownerName, String routeNumber)
    {
        super(regnNumber, speed, color, ownerName);
        this.routeNumber = routeNumber;
    }
    public void showData()
    {
        super.showData();
        System.out.println("Bus Details:");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Route Number: " + routeNumber);
    }
}

class Car extends Vehicle
{
    private String manufacturerName;
    Car(String regnNumber, double speed, String color, String ownerName, String manufacturerName)
    {
        super(regnNumber, speed, color, ownerName);
        this.manufacturerName = manufacturerName;
    }
    public void showData()
    {
        super.showData();
        System.out.println("Car Details:");
        System.out.println("Registration Number: " + regnNumber);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Manufacturer Name: " + manufacturerName);
    }
}
public class Question10 {
    public static void main(String[] args) {
        Bus bus = new Bus("B123", 60.0, "Yellow", "Alice", "Route 5");
        bus.showData();

        Car car = new Car("C456", 120.0, "Red", "Bob", "Toyota");
        car.showData();
    }
}
