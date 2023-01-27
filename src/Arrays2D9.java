/*Problem 1: Given a matrix ‘a’ of dimension n x m and 2 coordinates (l1, r1) and (l2, r2). Return the sum of the
        rectangle from (l1,r1) to (l2, r2).
        Pre-Requisites

        Method 1: Brute Force */
import java.io.*;
import java.util.*;
public class Arrays2D9
{
    public static int solve(int[][] a, int l1, int l2, int r1, int r2){
        int ans = 0;
        for(int i = l1; i <= l2; i++) {
            for(int j = r1; j <= r2; j++) {
                ans += a[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int row = sc.nextInt();
        System.out.println("Enter the no of columns");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter the elements of matrices");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

       // Cracking the Coding Interview in Java - Foundation

        System.out.println("Enter the value of l1,l2,r1,r2");
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println(solve(matrix,l1,l2,r1,r2));
    }
}