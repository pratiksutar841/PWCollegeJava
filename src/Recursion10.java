import java.util.Scanner;

//given 2 number x and y.  find the greater common divisor of x and y using recursion.
public class Recursion10
{
    static int GCD(int x, int y)
    {
       while (x%y!=0)
       {
           int rem = x % y;
           x = y;
           y=rem;
       }
       return y;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println(GCD(x,y));
    }
}
