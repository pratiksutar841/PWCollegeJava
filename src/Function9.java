/*Problem 2: Given an array of integers ‘a’, move all the even integers at the beginning of the array followed by
        all the odd integers. The relative order of odd or even integers does not matter. Return any array that satisfies
        the condition.
        Input :
        [1,2,3,4,5]
        Output :
        [4,2,3,1,5]
        Explanation:
        We need to keep all the even parity values at the beginning followed by the odd values so whenever we
        encounter the case of odd value at the start pointer and even value at the end pointer we swap them. Also we
        keep on incrementing the pointers if the values are already at the correct position.
        Code: */
import java.io.*;
import java.util.*;
public class Function9
{
    public static int[] sortArrayByParity(int[] a)
    {
        int i = 0, j = a.length-1;
        while(i < j)
        {
            if(a[i] % 2 == 1 && a[j] % 2 == 0)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
// swapping the values of a[i] and a[[j]
// Cracking the Coding Interview in JAVA - Foundation

            if(a[i] % 2 == 0) i++;
            if(a[j] % 2 == 1) j--;
        }
        return a;
    }
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5};
        int[] ans=sortArrayByParity(a);
        for (int element: ans)
        {
            System.out.print(element + " ");
        }
    }
}
