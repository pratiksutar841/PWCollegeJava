import java.util.Scanner;
public class SimpleInterest
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principle = ");
        float p = sc.nextFloat();
        System.out.print("Enter the rate interest = ");
        float r = sc.nextFloat();
        System.out.print("Enter the time = ");
        float t = sc.nextFloat();

        float si=(p*r*t)/100;
        System.out.println("Principle = "+p);
        System.out.println("Rate= "+r);
        System.out.println("Time = "+t);
        System.out.println("The simple interest = "+si);

    }
}
