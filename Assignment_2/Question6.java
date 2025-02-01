package Assignment_2;

class Overloading {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
    
}

public class Question6 {
    public static void main(String[] args) {
        Overloading q = new Overloading();
        System.out.println("Sum of 2 and 3: " + q.add(2, 3));
        System.out.println("Sum of 2, 3, and 4: " + q.add(2, 3, 4));
        System.out.println("Sum of 2.5 and 3.5: " + q.add(2.5, 3.5));
    }
}
