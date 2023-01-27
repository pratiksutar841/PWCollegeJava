//power of two digit
public class Recursion7
{
    static  int power(int p , int q)
    {
        if (q==0)
            return 1;
        return  power(p,q-1);
    }
    public static void main(String[] args)
    {
        System.out.println(power(5,4));
    }

}
