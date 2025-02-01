package Assignment_2;

class Student
{
    String name;

    Student(String name)
    {
        this.name = name;
    }
    void display()
    {
        System.out.println(name);
    }
}

public class Question15 {
    public static void main(String[] args) {
        Student student1 = new Student("Pari");
        Student student2 = new Student("Manasvi");
        student1.display();
        student2.display();
    }
}
