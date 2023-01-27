// Array Reference in java
public class Arrays10
{
    public static void main(String[] args)
    {
     int a[]= {1,2,3,4,5,6,7};
     int n = a.length;
     int b[] = new int[n];
     b=a;
     b[0]=5;
        System.out.print("Original array = ");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i]+" ");
        }
          System.out.print("\nReferenced Array = ");
        {

            for (int i = 0; i < n; i++)
            {
                System.out.print(b[i]+" ");
            }
        }
    }
}
