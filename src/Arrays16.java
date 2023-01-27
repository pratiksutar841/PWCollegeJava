import  java.util.*;
/* check if the given array is sorted or not */
public class Arrays16
{
    public static boolean Check(int a[])
    {
        boolean ans = true;
        for (int i = 1; i < a.length; i++)
        {
            if (a[i]<a[i-1])
            {
                ans=false;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println(Check(a));
    }
}
