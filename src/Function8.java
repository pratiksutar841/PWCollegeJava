/*Problem 1: Sort an Array consisting of only 0s and 1s.
        Input
        [ 0,1,1,0,1,1,0]
        Output
        [0,0,0,1,1,1,1]
        Code: */
import java.io.*;
import java.util.*;
public class Function8
{
    public static void sortZeroesAndOne(int[] a)
    {
        int n = a.length;
        int i = 0;
        int j = n - 1;
        while (i < j)
        {
            if (a[i] == 1 && a[j] == 0)
            {
                a[i] = 0;
                a[j] = 1;
                i++;
                j--;
            }
            if (a[i] == 0) i++;
            if (a[j] == 1) j--;
        }
    }
    public static void main(String[] args)
    {
        int[] a={0,1,1,0,1,1,0};
        sortZeroesAndOne(a);
        for (int element: a)
        {
            System.out.print(element +" ");
        }
    }
}
