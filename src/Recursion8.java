/* GivDn a numbDr num and a value k. Print k multiples ? of num.
        Constraints  : k > 0
        input : num = 12 , k = 5
        output : 12 , 24 , 36 , 48 , 60     */
import java.util.*;
public class Recursion8
{
    static void go(int n,int k , int i)
    {
    if(k == 0)return;
    System.out.print((n*i) + " ");
    go(n , k - 1 , i + 1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        go(n,k,1);
    }
}

