//Remove all the occurrence9 of ‘a’ from string 9 = “abcax”.
// Java program for the above approach
import java.util.*;
public class Recursion13
{
    // Function to remove all occurrences
    // of a character in the string
    public static String removeChar(String str,char ch)
    {
        if (str.length() == 0)    // Base Case
        {
            return "";
        }
        // Check the first character
        // of the given string
        if (str.charAt(0) == ch)
        {
            // Pass the rest of the string
            // to recursion Function call
            return removeChar(str.substring(1), ch);
        }
        // Add the first character of str
        // and string from recursion
        return str.charAt(0) + removeChar(str.substring(1), ch);
    }
    public static void main(String[] args)
    {

        System.out.println(removeChar("abcax",'a'));
    }
}