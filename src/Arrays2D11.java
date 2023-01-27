//Method 3: Prefix sum Over columns and Rows Both

import java.io.*;
import java.util.*;
public class Arrays2D11
{
    public static int solve(int[][] a, int l1, int l2, int r1, int r2){
        int n = a.length, m = a[0].length;
// making prefix in same matrix without constructing a new prefix matrix
// prefix sum of both row and columns
// horizontal prefix sum of every row is being calculated
// i is row and j is column in below for loops
        for(int i = 0; i < n; i++) {
            for(int j = 1; j < m; j++) {
                a[i][j] += a[i][j-1];
            }
        }
// vertical prefix sum
        for(int j = 0; j < m; j++) {
            for(int i = 1; i < n; i++) {
                a[i][j] += a[i-1][j];
            }
        }

        int left = 0, up = 0, leftup = 0;
        if(l1 >= 1) up = a[l1-1][r2];
        if(r1 >= 1) left = a[l2][r1-1];
        if(l1 >= 1 && r1 >= 1) leftup = a[l1-1][r1-1];
        int ans = a[l2][r2] - left - up + leftup;
        return ans;
    }

  //  Cracking the Coding Interview in Java - Foundation

  //  OUTPUT :
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
        System.out.println("Enter the value of l1,l2,r1,r2");
        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r1 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println(solve(matrix,l1,l2,r1,r2));
    }
}
