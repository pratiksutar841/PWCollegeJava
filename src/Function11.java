/*Problem 1: Given an integers array ‘a’, return the prefix sum/ running sum in the same array without creating a
        new array.
        Input :
        5 4 1 2 3
        Output :
        5 9 10 12 15
        Code: */
import java.io.*;
import java.util.*;
public class Function11
{
    public int[] runningSum(int[] a)
    {
        for (int i = 1; i < a.length; ++i)
        {
            a[i] += a[i - 1];
        }
        return a;
    }
    public static void main(String[] args){
        int[] a={5, 4, 1, 2, 3};
         Function11 obj1 = new  Function11();
        int[] ans=obj1.runningSum(a);
        for (int element: ans) {
            System.out.print(element +" ");
        }
    }
}