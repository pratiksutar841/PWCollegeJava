/*Problem 4: Given Q queries, check if the given number is present in the array or not.
        Note: Value of all the elements in the array is less than 105.
        Input :
        4
        1 1 2 7
        4
        1
        2
        3
        4
        Output:
        YES
        YES
        NO
        NO
        Code: Method 1 :*/
import java.util.*;
import java.lang.*;
public class Function7
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Arrays size = ");
        int n=sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter Arrays elements = ");
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
        }
        int N = 100100;
// creating a frequency array as max(a[i]) < 105
        int[] freq = new int[N];
        for (int i = 0; i < n; i++)
        {
            freq[a[i]] = freq[a[i]] + 1;
        }
        int q;
        q = sc.nextInt();
        while (q-- > 0)
        {
            System.out.print("Enter any elements = ");
            int val = sc.nextInt();
            if (freq[val] > 0)
            {
                System.out.println("This is found");
            }
            else
            {
                System.out.println("This is not found");
            }
        }
    }
}