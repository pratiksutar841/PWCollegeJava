import java.util.Scanner;

// Find the sum of digits for a given number n
/*   n=1234,   1+2+3+4=10   */
public class While4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfDigits =0 ;
        int original_n = n;
        while (n>0)
        {
            sumOfDigits+=n%10;
            n=n/10;

        }
        System.out.println("Number of Digits in " +original_n+ " = " +sumOfDigits);
    }
}

