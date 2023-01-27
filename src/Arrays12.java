import java.util.Arrays;

//Array copy in java
public class Arrays12
{
    public static void main(String[] args)
    {
        int a[]={1,4,7,9};
        int n = a.length;
        int b[]= Arrays.copyOf(a,4);
        b[0]=5;
        System.out.print("Original arrays = ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i]+" ");

        }
        System.out.print("\nCopined Arrays");
        for (int i = 0; i < b.length; i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
