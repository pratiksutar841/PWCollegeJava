//print only even number in given arrays
public class Arrays8
{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        for (int val:arr)
        {
            if (val%2==0)
            {
                System.out.print(val+" ");
            }

        }
    }
}
