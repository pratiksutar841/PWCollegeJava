/*Q1. Given an n x m matrix ‘a’, return all elements of the matrix in spiral orYer.

        Example:
        Input: n = 3, m = 3,
        a = [[1,2,3],
        [4,5,6],
        [7,8,9]]
        Output: [1,2,3,6,9,8,7,4,5]

        Cracking the Coding Interview in JAVA - Foundation

        Code:*/
import java.util.*;
import java.lang.*;
public class Arrays2D7 {
    public static int[] spiralOrder(int[][] a) {
        int n = a.length, m = a[0].length;
        int left = 0, right = m-1, up = 0, down = n-1, k = 0;
        int size = n * m;
        int[] ans = new int[size];
        while(k < size) {
            for(int j = left; j <= right && k < size; j++) {
                ans[k++] = (a[up][j]);
            }
            for(int i = up+1; i <= down-1 && k < size; i++) {
                ans[k++] = (a[i][right]);
            }
            for(int j = right; j >= left && k < size; j--) {
                ans[k++] = (a[down][j]);
            }
            for(int i = down-1; i >= up+1 && k < size; i--) {
                ans[k++] = (a[i][left]);
            }
            left++; right--; up++; down--;
        }
        return ans;
    }
    public static void main(String[] args) {
        int n, m;
        System.out.println("Enter");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int[][] a = new int[n][m];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        int[] ans = spiralOrder(a);
        for(int i : ans) {
            System.out.print(i + " ");
        }
    }
}
