import java.util.LinkedList;
import java.util.Queue;

public class CollectionFrame4
{
    public static void main(String[] args) {
        Queue<Integer>c=new LinkedList<>();
        c.offer(20);
        c.offer(40);
        c.offer(60);
        c.offer(80);
        c.offer(100);
        System.out.println(c.peek());
        System.out.println(c);
        c.poll();
        c.poll();
        System.out.println(c);
    }
}
