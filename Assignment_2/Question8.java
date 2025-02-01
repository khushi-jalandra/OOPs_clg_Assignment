package Assignment_2;

class Base {
    public static void show() {
        System.out.println("Static method in Base class");
    }
}

class Derived extends Base {
    public static void show() {
        System.out.println("Static method in Derived class");
    }
}

public class Question8 {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        Base base = new Base();
        Base derived = new Derived();
        base.show();
        derived.show();
    }
}
