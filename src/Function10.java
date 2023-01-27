/*Problem 3: Given an integer array ‘a’ sorted in non-decreasing order, return an array of the squares of each
        number sorted in non-decreasing order.
        Input :
        [-10,-3,2,5,6]
        Output :
        [4,9,25,36,100]
        Explanation:
        Note that the square of a negative number is always positive so we can just compare the absolute values.
        Given that the array is sorted, we can just take the higher absolute value from the first or last of the array and
        move our pointers accordingly. In the end we need to reverse our answer as we are taking the higher values
        first so it will be in decreasing order and we need to return our answer in non-decreasing order.

        Cracking the Coding Interview in JAVA - Foundation

        Code: */
import java.io.*;
import java.util.*;
public class Function10
{
    public int[] sortedSquares(int[] a)
    {
        int n = a.length, i = 0, j = n-1, k = 0;
        int[] ans = new int[n];
        while(i <= j) {
            if(Math.abs(a[i]) < Math.abs(a[j])) {
                a[j] *= a[j];
                ans[k++] = (a[j--]);
            } else {
                a[i] *= a[i];
                ans[k++] = (a[i++]);
            }
        }
        reverse(ans, 0, ans.length - 1);
        return ans;
    }
    private void reverse(int[] a, int i, int j){
        int temp = 0;
        while(i < j){
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        int[] a={-10,-3,2,5,6};
        Function10 obj1 = new Function10();
        int[] ans=obj1.sortedSquares(a);
        for (int element: ans) {
            System.out.print(element + " ");
        }
    }
}