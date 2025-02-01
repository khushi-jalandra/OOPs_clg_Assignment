package Assignment_2;

class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    public void animalName() {
        System.out.println("here the animal is dog");
    }
}

public class Question5 {
    public static void main(String[] args) {
        Dog f = new Dog();
        f.animalName();
        f.makeSound();        
    }
}
