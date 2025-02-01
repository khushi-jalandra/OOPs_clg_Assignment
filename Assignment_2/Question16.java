package Assignment_2;

class Counter {
    static int instanceCount = 0;
    Counter()
    {
        instanceCount++;
    }
    public static int getInstanceCount()
    {
        return instanceCount;
    }
}

public class Question16 {
    public static void main(String[] args)
    {
        new Counter();
        new Counter();
        new Counter();
        System.out.println("Number of instances created: " + Counter.getInstanceCount());
    }
}
