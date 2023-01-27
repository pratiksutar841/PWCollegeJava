// Reverse an array consisting of integer value
import java.io.*;
import java.util.*;
public class Function3
{
   public static  void reverse(int a[], int n)
    {
        int temp=0;
        int i= 0,j=n-1;
        while (i<j)
        {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j++;
        }
    }
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        System.out.println("Original Array");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println(" ");
        int n= a.length;
        reverse(a,n);
        System.out.println("Reversed Array");
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]+" ");
        }
    }
}
