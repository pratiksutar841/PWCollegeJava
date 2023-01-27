import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionFrame6
{
    public static void main(String[] args)
    {
        Set<Integer>c=new LinkedHashSet<>();
        c.add(10);
        c.add(20);
        c.add(300);
        c.add(40);
        c.add(50);
        System.out.println(c);
        c.remove(10);
        System.out.println(c);
        int d=c.size();
        System.out.println(d);
        System.out.println(c.contains(500));
    }
}
