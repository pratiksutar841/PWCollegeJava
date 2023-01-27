/*Q2: Given a square matrix, turn it by 90 degrees in a clockwise direction without using any extra space.

        Input: arr = [[1,2,3],[4,5,6],[7,8,9]]
        Output: [[7,4,1],[8,5,2],[9,6,3]

        Cracking the Coding Interview in JAVA - Foundation

        Explanation:
        Let size of row and column be 3.
        During first iteration –
        arr[i][j] = Element at first index (leftmost corner top)= 1.
        arr[j][n-1-i]= Rightmost corner top Element = 3.
        arr[n-1-i][n-1-j] = Rightmost corner bottom element = 9.
        arr[n-1-j][i] = Leftmost corner bottom element = 7.
        Move these elements in the clockwise direction.
        During second iteration –
        arr[i][j] = 2.
        arr[j][n-1-i] = 6.
        arr[n-1-i][n-1-j] = 8.
        arr[n-1-j][i] = 4.
        Similarly, move these elements in the clockwise direction
        Solution: */
import java.io.*;
import java.util.*;
public class Arrays2D5{
    public static void rotate(int arr[][],int N)
    {
        for (int i = 0; i < N / 2; i++)
        {
            for (int j = i; j < N - i - 1; j++)
            {

                int temp = arr[i][j];
                arr[i][j] = arr[N - 1 - j][i];
                arr[N - 1 - j][i] = arr[N - 1 - i][N - 1 - j];
                arr[N - 1 - i][N - 1 - j] = arr[j][N - 1 - i];
                arr[j][N - 1 - i] = temp;
            }
        }
    }
    public static void main(String[] args){
        int[][] arr1={{1,2,3},{4,5,6},{7,8,9}};
        int n=3;
        rotate(arr1,n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr1[i][j]+ " ");
            }
            System.out.println("");
        }
    } }