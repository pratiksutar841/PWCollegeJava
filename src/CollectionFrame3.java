import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionFrame3
{
    public static void main(String[] args)
    {
        List<Integer> c =new LinkedList<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
        System.out.println(c);
        c.remove(2);
        System.out.println(c);
        c.set(1,90);
        boolean f=c.contains(100);
        System.out.println(c);
        System.out.println(f);
    }
}
