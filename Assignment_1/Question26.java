package Assignment_1;

class Queue {
    int f,e,size ;
    int[]queue;
    Queue(int c )
    {
        f = 0;
        size = c;
        e=-1;
        queue = new int[size];
    }

    void enqueue(int data)
    {
        if(e==size-1)
        {
            System.out.println("Queue is full");
        }
        queue[++e]= data;
    }

   void  dequeue()
   {
        if(f>e)
        {
            System.out.println("Queue is empty");
            return ;
        }
        for(int i=0;i<e;i++)
        {
            queue[i]=queue[i+1];
        }
        e--;
    }

    void display(){
        for(int i = f;i<=e;i++)
        {
            System.out.print(queue[i]+"  ");
        }
    }
}

public class Question26 {
    public static void main(String[] args) {
        Queue q = new Queue(54);
        q.dequeue();
        q.enqueue(35);
        q.enqueue(543);
        q.display();
        System.out.println();
        q.dequeue();
        q.display();
    }
}
