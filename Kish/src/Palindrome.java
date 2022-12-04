import java.util.Locale;
import java.util.Scanner;

//3) Check if a string is a palindrome or not using a method called checkPalindrome(). Get the string from the user and pass the string as a parameter to the method.
public class Palindrome {
    static Scanner s= new Scanner(System.in);
    static String name;
    static  String rev= "";
    static boolean res;
    public static void main(String [] args)
    {
        System.out.println("Please Enter Any Word");
        name = s.nextLine();
        name = name.toLowerCase();
        boolean b = isPalindrome(name);
        if (b)
        System.out.println("The "+name+" is a Palindrome " + b);
        else
            System.out.println("The "+name+" is not a Palindrome " + b);
    }
    public static boolean isPalindrome(String name)
    {
        res = false;
        for (int i= name.length()-1; i>=0; i--)
        {
            rev= rev + name.charAt(i);
            if (name.equals(rev))
            {
                 res=true;
            }

        }
        return res;
    }
}
