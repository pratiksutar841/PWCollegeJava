// 2 integer a and b. swap the 2 given value using sum and difference method
public class Function2
{
    static void swapwithoutTemp(int x, int y)
    {
        System.out.println("Original value before swap");
        System.out.println("a: "+ x);
        System.out.println("b: "+ y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("Value after swap");
        System.out.println("a: "+ x);
        System.out.println("b: "+ y);
    }
    public static void main(String[] args)
    {
        int x=9;
        int y=3;
        int a []={1,2,3,4,5};

        swapwithoutTemp( x,y);
    }
}

