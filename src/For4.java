import java.util.Scanner;

// find the sum of the following series
/*   s=1-2+3-4...n  */
public class For4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 0;
        for (int i = 1; i <= n ; i++)
        {
           if (i%2==0)
           {
               ans-=i;
           }
           else
           {
               ans+=i;
           }
        }
        System.out.println(ans);
    }
}


