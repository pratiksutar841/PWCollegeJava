
import java.util.Scanner;
public class CubeOfNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number = ");
        int l = sc.nextInt();
        int cube = l*l*l;
        System.out.print("The Cube of Given number = "+cube);
    }
}
