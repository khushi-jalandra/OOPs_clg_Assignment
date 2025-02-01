package Assignment_1;

class Stack {
    int top = -1;
    int [] arr = new int[12];
    void push(int a)
    {
        if(top>=(arr.length)-1)
        {
            System.out.println("Stack overflow.");
        }
        else
        {
            top++;
            arr[top] = a;
        }
    }
    int pop()
    {
        if(top <0){
            System.out.println("Stack underflow");
            return 0;
        }
        else{
            top--;
            int  a = arr[top];
            return a ;
        }
  
    }

    void traverse()
    {
        for(int i = top;i>-1;i--){
            System.out.println(arr[i]+" ");
        }
  }
}

public class Question25 {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(834);
        s.push(287);
        s.push(432);
        s.traverse();
        System.out.println("Deleted element :"+s.pop());
        s.traverse();
    }
}
