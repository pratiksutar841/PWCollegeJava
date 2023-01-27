/*Problem 2: Check if we can partition the array into two subarrays with equal sum. More formally, check that the
        prefix sum of a part of the array is equal to the suffix sum of rest of the array.
        Input :
        5 2 3 4
        Output :
        True
        Explanation:
        We can simply calculate the total sum of the whole array in the first traversal. Then in the second traversal,
        check at every point that the sum of the prefix part of the array is equal to the suffix part of array. Calculate the
        suffix using total sum - current prefix.
        Code: */
import java.io.*;
import java.util.*;
public class Function12
{
    public static boolean check(int[] a)
    {
        int n = a.length;
        int pref = 0, total_sum = 0;
        for (int i = 0; i < n; i++)
        {
            total_sum += a[i];
        }
        for (int i = 0; i < n; i++)
        {
            pref += a[i];
            int suff = total_sum - pref;
            if (pref == suff) return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] a={5, 2, 3,4};
        System.out.println(check(a));
    }
}