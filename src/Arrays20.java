import  java.util.*;
/* Find the second-largest value */
public class Arrays20
{
    public static int secondLargestValue(int a[])
    {
        int n = a.length;
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++)
        {
            if (max < a[i])
                {
                    max = a[i];
                }
        }
        for (int i = 0; i < n; i++)
        {
            if (a[i] != max)
            {
                if (a[i]>smax)
                {
                    smax = a[i];
                }
            }
        }
        return smax ;
    }

    public static void main(String[] args)
    {
        int a[]={21,7,3,21,5,7,5};
        System.out.println(secondLargestValue(a));
    }
}



