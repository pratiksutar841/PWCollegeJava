/*Q1. Write a proQram to Print the tranJpoJe of the matrix entered by the uJer.
        Example 1:
        Input :
        row=3
        col=3
        arr[] = {{1,2,3}, {4,5,6}, {7,8,9}}
        Output : 1 4 7 2 5 8 3 6 9

        TranJpoJe of a matrix iJ obtained by chanQinQ rowJ to columnJ and columnJ to rowJ. In other wordJ, the
        tranJpoJe of arr[row][col] iJ obtained by chanQinQ arr[i][j] to arr[j][i].
        ApproacaÈ
        P Take the Jize of matriceJ throuQh uJer inputÂ
        P Take the matrice inputÂ
        P Create a new Matrix to Jtore the tranJpoJe of the matrixÂ
        P TraverJe each element of the matrix and. Store thiJ in the new matrix tranJ[i][j] = arr1[j][i]Â
        P Print the final tranJpoJed matrix

        Cracking the Coding Interview in JAVA - Foundation

        Solution:*/
        import java.io.*;
        import java.util.*;
public class Arrays2D4{
    public static void main(String args[]){
        int m,n;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        int arr1[][]=new int[m][n];
        int i,j;
        System.out.println("enter the matrix element=\n");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        int trans[][]=new int[m][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                trans[i][j]=arr1[j][i];
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println("");
        }
    } }