//write a program to print all natural number from n to 1 using recursion
import java.util.Scanner;
public class Recursion2
{
    static  void printDecreasing(int n)  //5 4 3 2 1
    {
        if (n==1)           //base case
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);       //self work
        printDecreasing(n-1);     //recursive work
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value = ");
        int n = sc.nextInt();
             printDecreasing(n);
    }
}
