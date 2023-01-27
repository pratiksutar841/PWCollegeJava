import java.util.Scanner;

public class IfElse4
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int  x = sc.nextInt();
        if (x>=0)
        {
            System.out.println("You entered a positive number");
        }
        else
        {
            System.out.println("You entered a negative number");
        }
    }
}
