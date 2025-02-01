package Assignment_2;

class Animal
{
    public void eat()
    {
        System.out.println("This animal eats food.");
    }
}

class Cat extends Animal
{
    public void walk()
    {
        System.out.println("The cat walks.");
    }
}

class Dog extends Cat
{
    public void bark()
    {
        System.out.println("The dog barks.");
    }
}
public class Question13 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.walk();
        dog.bark();
    }
}
