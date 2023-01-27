//Queue implimentetion using Arrays
import java.util.Scanner;
class queue
{
    int f=-1, r=-1;
    int n=10;
    int q[] = new int[n];

    void push()            //O(1)
    {
        Scanner sc = new Scanner(System.in);
        if (r==(n-1))
        {
            System.out.print("Overflow");
        }
        else
        {
            System.out.println("Enter data");
            int i = sc.nextInt();
           if (f==-1 && r==-1)
           {
               f=0;
               r=0;
               q[r]=i;
           }
           else
           {
               r=r+1;
               q[r]=i;
           }

        }
    }
    void  pop()         //O(1)
    {
        if (f==-1 && r==-1)
        {
            System.out.print("Underflow");
        }
        else
        {
           f=f+1;
        }
    }
    void  display()
    {
        System.out.println("Item are = ");
        for (int i = f; i <=r ; i++)
        {
            System.out.println(q[i]+" ");
        }
    }
}

public class Queue1
{
    public static void main(String[] args)
    {
        int d, l;
        Scanner sc = new Scanner(System.in);
        queue s = new queue();
        do {
            System.out.println("Press 1 to push");//enqueue
            System.out.println("Press 2 to pop");//dequeue
            System.out.println("Press 3 to display");
            System.out.print("Enter  your choice = ");
            d = sc.nextInt();
            switch (d)
            {
                case 1: s.push();
                    break;
                case 2: s.pop();
                    break;
                case 3: s.display();
                    break;
            }

            System.out.println("Enter 0 to go back the main menu = ");
            System.out.println("Enter any key to exit = ");
            l = sc.nextInt();
        }while (l==0);
        System.out.println("Exit sucessfully");
    }
}

