import java.util.Scanner;

// count the number of digits for a given number n
/*   n=123456    Divide n by 10 until n>0 count  the number of division*/
public class While3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numOfDigits =0 ;
        int original_n = n;
        while (n>0)
        {
            n=n/10;
            numOfDigits++;
        }
        System.out.println("Number of Digits in " +original_n+ " = " +numOfDigits);
    }
}
