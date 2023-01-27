//Circular linked List creation
import java.util.Scanner;
public class LinkedList4
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head = null;
    Node tail = null;
    public  void creation()
    {
        int n;
        Scanner sc= new Scanner(System.in);
        do {
            System.out.print("Enter the data = ");
            int data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null)
            {
                head = new_node;
                tail = new_node;
                new_node.next=head;
            }
            else
            {
                new_node.next = head;
                head = new_node;
                tail.next=head;
            }
            System.out.print("Do you want to add more data.If yes, prees:1= ");
            n = sc.nextInt();
        }
        while (n==1);
    }
    public  void  traverser()
    {
        Node temp=head;
        if (head ==null)
        {
            System.out.println("LL does not exist");
        }
        else
        {
            do
            {
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
            while (temp!=head);
        }
    }
    public static void main(String[] args)
    {
        LinkedList1 ll=new LinkedList1();
        ll.creation();
        ll.traverser();
    }
}
