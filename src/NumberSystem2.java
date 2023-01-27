import java.util.Scanner;
//    Convert  Decimal numbers to decimal
public class NumberSystem2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        int pw = 1;
        while (n>0)
        {
          int parity = n%2;
          ans+=pw*parity;
          pw*=10;
          n/=2;
        }
        System.out.println(ans);
    }
}
