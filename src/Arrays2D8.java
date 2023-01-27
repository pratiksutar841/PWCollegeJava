/*Q2 Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order.

        Example :
        Input: n = 3
        Output: [[1,2,3],
        [8,9,4],
        [7,6,5]]

        Cracking the Coding Interview in JAVA - Foundation

        Solution: */
import java.util.*;
import java.lang.*;
public class Arrays2D8 {
    public static int[][] generateMatrix(int n) {
        int[][] a = new int[n][n];
        int val = 1;
        int left = 0, right = n-1;
        int up = 0, down = n-1;
        n = n*n;
        n++;
        while(val < n) {
            for(int j = left; j <= right && val < n; j++) {
                a[up][j] = val++;
            }
            for(int i = up+1; i <= down-1 && val < n; i++) {
                a[i][right] = val++;
            }
            for(int j = right; j >= left && val < n; j--) {
                a[down][j] = val++;
            }
            for(int i = down-1; i >= up+1 && val < n; i--) {
                a[i][left] = val++;
            }
            left++; right--; up++; down--;
        }
        return a;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[][] a = generateMatrix(n);
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
