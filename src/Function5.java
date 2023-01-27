import java.util.Scanner;

//Rotate the given array 'a'  by k steps , where k is non-negative ,k can be greater than n as well
public class Function5
{
   public static void rotate(int a[],int k)
   {
       int n = a.length;
       k%=n;
       int ans[]=new int[n];
       for (int i = n-k; i <=n-1 ; i++)
       {
        ans[i-(n-k)]=a[i];
       }
       for (int i = 0; i < n-k; i++)
       {
        ans[i+k]=a[i];
       }
       for (int i = 0; i < n; i++)
       {
        a[i]=ans[i];
       }
   }
    public static void main(String[] args)
    {
      int a[]={1,2,3,4,5};
        System.out.println("\nOriginal Arrays = ");
        for (int  i = 0; i < a.length; i++)
        {
            System.out.print( a[i]+" ");
        }
        System.out.println(" ");
        int k=4;
        rotate(a,k);
        System.out.println("Rotated Arrays = ");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
