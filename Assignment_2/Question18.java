package Assignment_2;

interface A
{
    void A1();
    void A2();
}

interface B
{
    void B1();
    void B2();
}

interface C
{
    void C1();
    void C2();
}

interface D extends A,B,C
{
    void D1();
}

class Base implements A,B,C{
    public void A1()
    {
        System.out.println("Interface A method");
    }
    public void A2()
    {
        System.out.println("Interface A method");
    }

    public void B1()
    {
        System.out.println("Interface B method");
    }

    public void B2()
    {
        System.out.println("Interface B method");
    }
    public void C1(){
        System.out.println("Interface C method");
    }
   
    public void C2(){
        System.out.println("Interface C method");
    }
}

class Heirs extends Base implements D{
    public void D1(){
        System.out.println("Interface D method");
    }
    public void H1(A a1){
      a1.A1();
      a1.A2();

    }
    public void H2(B b1){
        b1.B1();
        b1.B2();
    }
    public void H3(C c1){
        c1.C1();
        c1.C2();
    }
    public void H4(D d1){
        d1.A1();
        d1.A2();
        d1.B1();
        d1.B2();
        d1.C1();
        d1.C2();
        d1.D1();
    }

}

public class Question18 {
    public static void main(String[] args) {
        Heirs H = new Heirs();
        H.H1(H);
        H.H2(H);
        H.H3(H);
        H.H4(H);
    }
    
}
