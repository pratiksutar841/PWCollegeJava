import  java.util.*;
/* Count the number of occurence of a particular elements x */
public class Arrays14
{
    public static int countOfElements(int a[],int x)
    {
        int count=0;
        for (int i = 0; i < a.length; i++)
        {
            if (a[i]==x)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int a[]={1,4,7,9,1};
        System.out.println(countOfElements(a,1));
    }
}
