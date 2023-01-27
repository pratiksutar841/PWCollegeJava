import java.util.ArrayList;
//Implementation
public class ArrayList4
{
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>>mainlist = new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>();
        list.add(1);
        list.add(2);
        mainlist.add(list);

        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(3);
        list1.add(4);
        mainlist.add(list1);

        for (int i = 0; i <mainlist.size() ; i++)
        {
          ArrayList<Integer>currList=mainlist.get(i);
            for (int j = 0; j <currList.size() ; j++)
            {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainlist);
    }
}
