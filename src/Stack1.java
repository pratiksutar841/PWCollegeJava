//Stack implimentetion using Arrays
import java.util.Scanner;
class stack
{
    int top = -1;
    int n=10;
    int a[] = new int[n];

    void push()            //O(1)
    {
        Scanner sc = new Scanner(System.in);
        if (top==(n-1))
        {
            System.out.print("Overflow");
        }
        else
        {
            System.out.print("Enter data = ");
            int i = sc.nextInt();
            top=top+1;
            a[top]=i;
            System.out.print("Item inserted\n");
        }
    }
    void  pop()         //O(1)
    {
        if (top==-1)
        {
            System.out.print("Underflow");
        }
        else
        {
            top=top-1;
            System.out.print("Item deleted");
        }
    }
    void  display()
    {
        System.out.println("Item are = ");
        for (int j = top; j >=0 ; j--)
        {
            System.out.println(a[j]+" ");
        }
    }
}

public class Stack1
{
    public static void main(String[] args)
    {
        int d, l;
        Scanner sc = new Scanner(System.in);
        stack s = new stack();
        do {
            System.out.println("Press 1 to push");
            System.out.println("Press 2 to pop");
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

