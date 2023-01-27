import java.util.Scanner;
public class IfElse3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age = ");
        int  age = sc.nextInt();
        if (age<=12)
        {
                if (age<=5)
                  {
                    System.out.println("Toddler");
                  }
                else
                  {
                    System.out.println("Child");
                  }
        }
        else
        {
            System.out.println("Teenager");
        }

    }
}

