//Print only positive number in given arrays
public class Arrays7
{
    public static void main(String[] args)
    {
        int arr[]={2,4,-1,5,-9,7,-4};
        for(int val:arr)
        {
            if (val>=0)
            {
                System.out.print(val+" ");
            }
        }
    }
}
