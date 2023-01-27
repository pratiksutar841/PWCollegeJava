//Write a program  to find the value of factorial 5
import java.util.Scanner;
public class Recursion3
{
    static  int factorial (int n)
    {
        if (n==0)                //base case
        {
            return  1;
        }
            //smaller problem-recursive work
        return n * factorial(n-1);               //big problem-self work

    }
    public static void main(String[] args)
    {
        System.out.println(factorial(5 ));
    }
}
