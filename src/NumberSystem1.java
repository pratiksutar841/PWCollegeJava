import java.util.Scanner;

//    Convert Binary to Decimal numbers
public class NumberSystem1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int pw = 1;
        while (n>0)
        {
            int unit_digit = n%10;
            ans+=pw*unit_digit;
            n/=10;
            pw *= 2;
        }
        System.out.println(ans);
    }
}
