//Topic 2: Taking 2D Array as input:
import java.util.Scanner;
import java.io.*;
public class Arrays2D2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        int row = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        int total = row * col;
        System.out.println("Please enter " + total + " elements now.");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("The Input array is :");
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}