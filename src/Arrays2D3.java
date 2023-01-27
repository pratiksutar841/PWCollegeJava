/*Q1 Write a progra\ to display Multiplication of two \atrices entered by the user.
        Example

        Approach
        j Take the size of \atrices through user input[
        j Take the two \atrices to be \ltipliep
        j No need to check co\patibility as size of both \atrices are sa\
        j Create a new Matrix to store the product of the two \atrice
        j Traverse each ele\ent of the two \atrices and ltiply the\. ktore this product in the new \atrix at the
        corresponding index[
        j Print the final product \atrix

        Cracking the Coding Interview in JAVA - Foundation

        Solution*/

import java.util.*;
public class Arrays2D3
{
    public static void main(String args[]){
        int m,n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows=");
        m=sc.nextInt();
        System.out.println("enter the number of columns=");
        n=sc.nextInt();
        int arr1[][]=new int[m][n];
        int arr2[][]=new int[m][n];
        int ans[][]=new int[m][n];
        int i,j,k;
        System.out.println("enter the first matrix element=\n");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the Second matrix element=\n");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("multiply of the matrix=\n");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                ans[i][j]=0;
                for(k=0;k<n;k++)
                {
                    ans[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println(" ");
        }
    } }