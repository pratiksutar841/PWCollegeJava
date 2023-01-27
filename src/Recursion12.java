// Java program to find sum of array
// elements using recursion.
// Return sum of elements in A[0..N-1]
// using recursion.
import java.io.*;
import java.util.*;
public class Recursion12
{
    public static int total(int arr[], int n)
            {
            if (n <= 0)
            return 0;
            return (total(arr, n - 1) + arr[n - 1]);
             }
    public static void main(String[] args)
    {
        int[] arr={2,3,5,20,1};
        int n=arr.length;
        System.out.println(total(arr,n));
    }
}
