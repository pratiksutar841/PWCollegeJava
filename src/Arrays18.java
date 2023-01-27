import  java.util.*;
/* Count the number of triplets whose sum is equal to the given value x */
public class Arrays18
{
    public static int findTriplet(int a[],int x)
    {
        int n= a.length;
        int count=0;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = i+1; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                {
                if (a[i]+a[j]+a[k]==x)
                   {
                    count++;
                   }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[]={4,7,3,21,6,5};
        System.out.println(findTriplet(a,16));
    }
}

