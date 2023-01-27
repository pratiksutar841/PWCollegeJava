public class Function16
{
    public static int binCoeff(int n, int r)
    {
        int fact_n = Function15.factorial(n);
        int fact_r = Function15.factorial(r);
        int fact_nmr = Function15.factorial(n-r);

        int binCoeff = fact_n/(fact_r * fact_nmr);
        return binCoeff;


    }
    public static void main(String[] args)
    {
        System.out.println(binCoeff(5,3));
    }
}
