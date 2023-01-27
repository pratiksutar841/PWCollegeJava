import java.util.Scanner;

// Reverse the digits of numbers
/*   n=1234=   4321  */
public class While5
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans=0 ;
        int original_n = n;
        while (n>0)
        {
            ans = ans*10 + n % 10;
            n=n/10;

        }
        System.out.println("Reverse of Digits in " +original_n+ " = " +ans);
    }
}


