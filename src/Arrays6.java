//Search if the given number x is present in the array or not And find the index,ifnnot present rhen return the index as -1
public class Arrays6
{
    public static void main(String[] args)
    {
        int arr[]={8,7,6,5,4,3};
        int x=1;
        int ans = -1;
        for (int i = 0; i < arr.length; i++)
        {
           if (arr[i]==x)
           {
               ans=i;
           }

        }
        System.out.println("found "+x+" at index "+ans );
    }
}
