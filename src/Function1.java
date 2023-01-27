// SWap the  2 number usinf temp variable
public class Function1
{
    static void swap(int x, int y)
    {
        System.out.println("Original value before swap");
        System.out.println("a: "+ x);
        System.out.println("b: "+ y);
        int temp = x;
        x = y;
        y = temp;
        System.out.println("Value after swap");
        System.out.println("a: "+ x);
        System.out.println("b: "+ y);
    }
    public static void main(String[] args)
    {
     int x=9;
     int y=3;
     int a []={1,2,3,4,5};

     swap( x,y);
    }
}
