package Assignment_2;

class Animal
{
    public void makeSound() 
    {
        System.out.println("animal makes sound");        
    }
}
class Cat extends Animal
{
    public void makeSound()
    {
        super.makeSound();
        System.out.println("Cat is Meowing");
    }
}

public class Question7 {

    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();
    }
}