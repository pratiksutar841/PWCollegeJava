//Binary tree craetion
import java.util.*;
public class Trees2
{
    static class Node
    {
        Node left,right;
        int data;
        public Node(int data)
        {
            this.data=data;
            left=null;
            right=null;
        }
    }
    static Node create()
    {
        int data;
        Scanner sc = new Scanner(System.in);
        Node root=null;
        System.out.print("Enter value = ");
        data = sc.nextInt();
        if (data==-1) {
            return null;
        }
        root = new Node(data);
        System.out.println("Enter left child of "+root.data);
        root.left=create();
        System.out.println("Enter right child of "+root.data);
        root.left=create();
        return root;
    }
    static void Inorder(Node root)
    {
        if (root==null)
            return;
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);
    }

    static  void Preorder(Node root)
    {
        if (root==null)
            return;

        Preorder(root.left);
        System.out.print(root.data+" ");
        Preorder(root.right);
    }

    static void postorder(Node root)
    {
        if (root==null)
            return;
        postorder(root.left);
        System.out.print(root.data+" ");
        postorder(root.right);

    }

    public static void main(String[] args)
    {
        Node root = create();
        Preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        Inorder(root);
        System.out.println();
    }

}
