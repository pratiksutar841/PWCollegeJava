import java.util.Scanner;
public class NameGiven
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int num = sc.nextInt();
        System.out.println("Your Lucky number is = "+num);
        System.out.print("Enter your name = ");
        String name = sc.next();
        System.out.print("The Name is = "+name);

    }
}


