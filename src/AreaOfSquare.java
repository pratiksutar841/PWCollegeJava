import java.util.Scanner;
public class AreaOfSquare
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of Square = ");
        int l = sc.nextInt();
        int area = 4*l;
        System.out.print("The area of Square is = "+area);

    }
}

