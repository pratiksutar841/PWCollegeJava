//print the nth factorial numbers
import java.util.Scanner;

// find the sum of the following series
/*   s=1-2+3-4...n  */
public class For5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n ; i++)
        {
           fact=fact*i;
            System.out.println("Factorial of "+ i +" : " +fact);
        }

    }
}


