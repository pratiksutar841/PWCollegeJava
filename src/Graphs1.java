import java.util.LinkedList;
import java.util.Scanner;

//Implementation of Graphs DS using Adjacency List
public class Graphs1
{
    private LinkedList<Integer>adjacency[];
    public Graphs1(int v)
    {
        adjacency = new LinkedList[v];
        for (int i = 0; i < v; i++)
        {
         adjacency[i]=new LinkedList<Integer>();
        }
    }
    public void insertedge(int s, int d)
    {
        adjacency[s].add(d);
        adjacency[d].add(s);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices and edges = ");
        int v= sc.nextInt();
        int e = sc.nextInt();
        Graphs1 g= new Graphs1(v);
        System.out.println("Enter edges");
        for (int i = 0; i < e ; i++)
        {
          int s= sc.nextInt();
          int d= sc.nextInt();
          g.insertedge(s,d);
        }
    }
}
