import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionFrame5
{
    public static void main(String[] args) {
        Queue<Integer>c=new PriorityQueue<>();
        c.offer(100);
        c.offer(90);
        c.offer(80);
        c.offer(70);
        c.offer(60);
        c.offer(50);
        c.offer(40);
        System.out.println(c);
        c.poll();
        System.out.println(c);
    }
}
