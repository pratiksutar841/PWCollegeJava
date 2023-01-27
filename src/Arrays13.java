import  java.util.*;
/*  Find the last occurrenece of an element x in a given array*/
public class Arrays13
{
    public static int LastOccurance(int a[],int x)
    {
        int index=-1;
        for (int i = 0; i < a.length; i++)
        {
          if (a[i]==x)
          {
              index=i;
          }
        }
        return index;
    }

    public static void main(String[] args) {
        int a[]={1,4,7,9,1};
        System.out.println(LastOccurance(a,1));
    }
}
