package Assignment_2;

class ConstructorConcept
{
    ConstructorConcept()
    {
        System.out.println("default constructor.....");
    }
    ConstructorConcept(int rollno , String name)
    {
        System.out.println("paramerterized constructor.......");
        System.out.println("roll number : "+rollno+" name : "+name);
    }
    ConstructorConcept(ConstructorConcept ref)
    {
        System.out.println("copy constructor........");
    }

}
public class Question4 {
    public static void main(String[] args) {
        new ConstructorConcept();
        new ConstructorConcept(31, "khushi");
        new ConstructorConcept(new ConstructorConcept(40,"Manasvi"));
    }
}
