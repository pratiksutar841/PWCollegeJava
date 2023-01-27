//Single linked List data insertion and deletion at different location
import java.util.Scanner;
public class LinkedList3
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
    public void delete()
    {
        int n;
        Scanner sc = new Scanner(System.in);
        do
        {
            if (head==null)
            {
                System.out.println("LL is empty");
            }
            else
            {
                System.out.println("Enter :\n 1 to delete item at beginning\n 2 to delete the item at the end\n3 to delete at specific location");
                int m = sc.nextInt();
                switch (m)
                {
                    case 1:  Node temp=head;
                             temp=temp.next;
                             head=temp;
                             break;
                    case 2:  Node temp1=head;
                    Node ptr=temp1.next;
                        while (ptr.next!=null)
                        {
                            temp1=ptr;
                            ptr=ptr.next;
                        }
                        temp1.next=null;
                        break;
                    case 3:
                        System.out.println("Enter positon of node to be delete");
                        int p= sc.nextInt();
                        Node temp2=head;
                        Node ptr1=temp2.next;
                        for (int i = 0; i <(p-2) ; i++)
                        {
                            temp2=ptr1;
                            ptr1=ptr1.next;
                        }

                        temp2.next=ptr1.next;
                        break;
                }
            }
            System.out.print("Do you want to delete more data.If yes, prees:1= ");
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
            while (temp!=null)
            {
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args)
       {
        LinkedList3 ll = new LinkedList3();
        ll.creation();
        ll.delete();
        ll.traverser();
       }
    }
