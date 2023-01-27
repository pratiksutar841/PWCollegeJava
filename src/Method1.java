//  Add twonumbers using method
import java.util.Scanner;
class Add
{
    int add(int a, int b)
    {
          int ans = a+b;
          return  ans;
    }
}

public class Method1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Add obj = new Add();
        int ans=obj.add(a,b);
        System.out.println("sum of input number is = "+ans);
    }
}
