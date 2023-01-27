import java.util.Scanner;
public class QuadraticEquation
{
    public static void main(String[] args)
    {
        double r1,r2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a,b,c = ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d =(b*b)-(4*a*c);
        if (d==0)
        {
            System.out.println("Roots are real and equal");
            r1=r2=-b/(2*a);
            System.out.println("Roots of R1 =  "+r1+"and R2 = "+r2);
        }
        else if(d>0)
        {
            System.out.println("Roots are real and distinct");
            r1=(-b+Math.sqrt(d))/(2*a);
            r2=(-b-Math.sqrt(d))/(2*a);
            System.out.println("Roots of R1  "+r1+" and R2 = "+r2);
        }
        else
        {
            System.out.println("Roots are  distinct and Imaginary");
            double x=-b/(2*a);
            double y =Math.sqrt(-b)/(2*a);
            System.out.println("R1 = "+x+" +i"+y);
            System.out.println("R2 = "+x+" -i"+y);
        }
    }
}
