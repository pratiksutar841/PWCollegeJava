class Algebra
{
     int a=10;
     int b = 20;
     int add()
     {
         return  a+b;
     }
     int sub()
     {
         return  a-b;
     }
}
public class Method2
{
    public static void main(String[] args)
    {
     Algebra obj = new Algebra();
     int ans = obj.add();
        System.out.println(ans);
    }
}
