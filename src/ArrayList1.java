import java.util.ArrayList;
public class ArrayList1
{
    public static void main(String[] args)
    {
        ArrayList<Integer>list=new ArrayList<>();
        ArrayList<String>list1=new ArrayList<>();
        ArrayList<Boolean>list2=new ArrayList<>();
        //operation
        list.add(10);//O(1)
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(1,23);  //O(n)
        System.out.println(list);

        int element =list.get(2);  //get operation
        System.out.println(element);

        list.remove(2);        //delete
        System.out.println(list);

        list.set(2,67);                         //set
        System.out.println(list);

        System.out.println(list.contains(10));       //contains
        System.out.println(list.contains(11));

        System.out.println(list.size());//size

        for (int i = 0; i < list.size(); i++)     //print arrays
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        for (int i = list.size()-1; i >=0 ; i--)  //print reverse
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();



                                                        //max number
        int max= Integer.MIN_VALUE;
        for (int i = 0; i <list.size() ; i++)
        {
          max=Math.max(max, list.get(i));
        }
        System.out.println("Maximum element = "+max);

        int idx1=1;






    }
}
