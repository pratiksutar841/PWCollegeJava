//Method 2: Pre-Calculating the horizontal sum for each row in the Matrix
import java.io.*;
import java.util.*;
public class Arrays2D10
{
    public static int solve(int[][] a, int l1, int l2, int r1, int r2){
        int ans = 0;
        int n = a.length, m = a[0].length;
// calculating the horizontal sum for each row in the Matrix
        for(int i = 0; i < n; i++) { // 'i' is row
            for(int j = 1; j < m; j++) { // 'j' is column
                a[i][j] += a[i][j-1];
            }
        }
// now only traversing over rows through below for loop
// as we have precalculated prefix matrix
        for(int i = l1; i <= l2; i++) {
            if(r1 >= 1)ans += a[i][r2] - a[i][r1-1];
            else ans += a[i][r2];
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
               /// Explanation Method 1: We add the value of each element in the given range from l1 to l2 and from r1 to r2.
              //  This can be done using a brute force approach where we use two nested for loops and keep adding the value
              //  of the elements to the answer.

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
