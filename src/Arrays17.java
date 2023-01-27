import  java.util.*;
/* Find the total number of pairs in the array whose sum is equal to the given value x */
public class Arrays17
{
    public static int pairSum(int a[],int x)
    {
        int count=0;
        int n =a.length;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i+1; j < n; j++)
            {
               if (a[i]+a[j]==x)
                {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[]={1,4,7,9,1};
        System.out.println(pairSum(a,10));
    }
}

