/*Write a program to check whether a string is a Palindrome.
        Input : str = "abcba"        Output: Yes  */
import java.io.*;
import java.util.*;

public class Recursion15
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
        Recursion15 obj1 = new Recursion15();
        String str1="abcba";
        String ans1 = obj1.reverse(str1);
        if(str1.equals(ans1)){
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}