//Write a  program to print all natural numbers from 1 to n using recursion
import java.util.Scanner;
public class Recursion1
{
    static void printIncreasing(int n)
    {
        if (n==1)
        {
            System.out.println(n);
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number = ");
        int n = sc.nextInt();
        printIncreasing(n);
    }
}
