import java.util.Scanner;

public class While2
{
    public static void main(String[] args)
    {
        int num=1,sum=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (num<=n)
        {
            sum=sum+num;
            num++;
        }
        System.out.println(sum);
    }
}
