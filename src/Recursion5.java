//Sum of digit
import java.util.*;
public class Recursion5
{
    static int sunOfDigit(int n)
       {
        if (n == 0)
        return 0;
        return (n % 10 + sunOfDigit(n / 10));
}
    public static void main(String[] args)
    {
        System.out.print("Enter the number = ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int ans = sunOfDigit(n);
        System.out.println(" Sum of digits in " + n + " is " + ans );
    }
}
