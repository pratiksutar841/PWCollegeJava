//find the program that count the digit
import java.util.*;


public class Recursion6
{   static int countOfDigit(int n)
{
    if (n>=0&&n<=9)
        return 1;
    return countOfDigit(n/10)+1;
}
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ans = countOfDigit(n);
        System.out.println(" Sum of digits in " + n + " is " + ans );
    }
}
