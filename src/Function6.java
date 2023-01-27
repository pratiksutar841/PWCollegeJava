/*Explanation Method 1 : Create a new answer array and add the last k elements first in the answer array and the
        rest of the elements after that. We can do that by traversing the array twice as shown. Note: Make sure to take
        modulus of k by n, as value of k can be greater than n so it will become less than n as :
        k = constant * n + reminder
        Here reminder = k % n
        If we rotate an array n times it will be worthless as it will come back to the same position, so just remove that
        from k and take the reminder part only.
        Code: Method 2 : */
import java.util.*;
import java.lang.*;
public class Function6 {
    // without extra space
    public static void rotate(int[] a, int k)
    {
        k %= a.length;
        reverse(a, 0, a.length - 1);
        reverse(a, 0, k - 1);
        reverse(a, k, a.length - 1);
    }
    private static void reverse(int[] a, int i, int j)
    {
        int tmp = 0;
        while(i < j){
            tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            i++;
            j--;
        }
    }
// without extra space
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter n = ");
        n=sc.nextInt();
        System.out.print("Enter k = ");
        int k;
        k = sc.nextInt();
        System.out.print("Enter the array elements = ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Output: ");
        rotate(a, k);
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}
