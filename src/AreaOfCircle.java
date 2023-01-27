import java.util.Scanner;
public class AreaOfCircle
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle = ");
         double r = sc.nextInt();
         double area = 3.14*r*r;
         System.out.print("The area of Square is = "+area);

    }
}


