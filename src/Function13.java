/*Problem 3: Given an array of integers of size n. Answer q queries where you need to print the sum of values in a
        given range of indices from l to r (both included).
        Note: The values of l and r in queries follow 1-based indexing.
        Input :
        5
        5 1 2 3 4
        4
        1 1
        1 3
        4 5
        1 5
        Output :
        5
        8
        7
        15
        Code: */
import java.io.*;
import java.util.*;
public class Function13 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            a[i] += a[i - 1];
        }
// making a prefix sum array out of given array
//Cracking the Coding Interview in JAVA - Foundation

        int q;
        q = sc.nextInt();
        while (q>=0) {
            int l, r;
            l = sc.nextInt();
            r = sc.nextInt();

            int ans = (a[r] - a[l-1]);
            System.out.println(ans);
            q--;
        }
    }
}