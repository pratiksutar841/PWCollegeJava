//Single linked List data insertion at different location
import java.util.Scanner;
public class LinkedList2
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
            }
            else
            {
                System.out.println("Enter :\n 1 to insert item at beginning\n 2 to insert the item at the end\n3 to insert at specific location");
                int m = sc.nextInt();
                switch (m)
                {
                    case 1:  new_node.next=head;
                             head=new_node;
                             break;
                    case 2:  Node temp=head;
                             while (temp.next!=null)
                                   {
                                    temp=temp.next;
                                   }
                                    temp.next=new_node;
                                    break;
                    case 3:
                        System.out.println("Enter positon of node to be inserted");
                        int p= sc.nextInt();
                        Node temp1=head;
                        for (int i = 0; i <(p-1) ; i++)
                        {
                         temp1=temp1.next;
                        }
                        new_node.next=temp1.next;
                        temp1.next=new_node;
                        break;
                }
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
        else {
            while (temp!=null)
            {
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args)
    {
        LinkedList2 ll=new LinkedList2();
        ll.creation();
        ll.traverser();
    }
}
