//swap arrayslist
import java.util.ArrayList;
public class ArrayList2
{
    public static void swap(ArrayList<Integer>list, int idx1, int idx2)
    {
        int temp =list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2,temp);
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String>list1=new ArrayList<>();
        ArrayList<Boolean>list2=new ArrayList<>();
        //operation
        list.add(10);//O(1)
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        int idx1=1, idx2=3;
        System.out.println(list);
        swap(list, idx1,idx2);
        System.out.println(list);
    }
}
