// Write a program to print the reverse of a string using recursion.
//        pratik -> kitarp
import java.util.*;
public class Recursion14
{
    //recursive function to reverse a string
    public String reverse(String str)
    {
        //checks if the string is empty
        if(str.isEmpty())
        {
            return str;
        }
        else
        {
            return reverse(str.substring(1))+str.charAt(0);
        }
    }
    public static void main(String[] args)
    {
        Recursion14 obj1 = new Recursion14();
        String ans1 = obj1.reverse("Physics");
        System.out.println(ans1);

    }
}


