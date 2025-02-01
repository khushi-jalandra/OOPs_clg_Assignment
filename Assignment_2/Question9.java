package Assignment_2;

import java.util.Scanner;

abstract class ThreeDObject 
{
    public abstract double wholeSurfaceArea();
    public abstract double volume();
}

class Box extends ThreeDObject
{
    private double length, width, height;

    Box(double length, double width, double height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double wholeSurfaceArea()
    {
        return 2 * (length * width + width * height + height * length);
    }

    public double volume()
    {
        return length * width * height;
    }
}

class Cube extends ThreeDObject
{
    private double side;

    Cube(double side)
    {
        this.side = side;
    }

    public double wholeSurfaceArea()
    {
        return 6 * side * side;
    }

    public double volume()
    {
        return side * side * side;
    }
}

class Cylinder extends ThreeDObject 
{
    private double radius, height;

    Cylinder(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }

    public double wholeSurfaceArea()
    {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume()
    {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject 
{
    private double radius, height;
    Cone(double radius, double height)
    {
        this.radius = radius;
        this.height = height;
    }

    public double wholeSurfaceArea()
    {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    public double volume()
    {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}

public class Question9 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Box
        System.out.println("Enter dimensions for Box (length, width, height):");
        double boxLength = sc.nextDouble();
        double boxWidth = sc.nextDouble();
        double boxHeight = sc.nextDouble();
        Box box = new Box(boxLength, boxWidth, boxHeight);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        // Cube
        System.out.println("Enter side length for Cube:");
        double cubeSide = sc.nextDouble();
        Cube cube = new Cube(cubeSide);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        // Cylinder
        System.out.println("Enter dimensions for Cylinder (radius, height):");
        double cylinderRadius = sc.nextDouble();
        double cylinderHeight = sc.nextDouble();
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        System.out.println("Cylinder Surface Area: " + cylinder.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cylinder.volume());

        // Cone
        System.out.println("Enter dimensions for Cone (radius, height):");
        double coneRadius = sc.nextDouble();
        double coneHeight = sc.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());
    }
}
