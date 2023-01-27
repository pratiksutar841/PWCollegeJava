import java.util.Scanner;

//Taking input in an arrays
public class Arrays9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array = ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter " +n+ " elements = ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.print("The array elements are = ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] +" ");
        }
    }
}
