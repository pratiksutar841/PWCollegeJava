/*Q3. Given an integer n, return the first n rows of Pascal's triangle.
        In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

        Example 1:
        Input: n = 5
        Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
        Example 2:
        Input: n = 1
        Output: [[1]]

        Cracking the Coding Interview in JAVA - Foundation

        Approachv
        k Take a number of rows to be printed, nG
        k Make outer iteration i for n times to print rowsG
        k We can observe that the first row has 1 column and as we lo on the next row col keeps on increasinl by 1G
        k Make inner iteration j for col timesG
        k We can observe that the first and last element of every row is 1 G
        k If the element is neither in the first nor in the last column,then the element is the sum of the two numbers
        directly above it H
        Solutionw*/
import java.io.*;
import java.util.*;
public class Arrays2D6{
    public static int[][] pascal(int n) {
        int[][] ans=new int[n][];
        int col=1;
        for(int i=0;i<n;i++){
            ans[i]=new int[col];
            for(int j=0;j<col;j++){
                if(j==0){ans[i][j]=1;}
                else if(j==col-1){ans[i][j]=1;}
                else{
                    ans[i][j]=ans[i-1][j-1]+ans[i-1][j];
                }
            }
            col++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[][] ans=pascal(n);
        for(int i=0;i<n;i++){
            for(int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println("");
        }
    }
}