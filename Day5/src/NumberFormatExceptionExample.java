//4) Write a Program to take care of Number Format Exception if user enters values other that integer for calculating average of marks ten students. Do not allow program to terminate but again continue with the program after giving respective message to User.
public class NumberFormatExceptionExample
{

    static String inputString = "123.33";

    public static void main(String[] args)
    {
        try
        {
            int a = Integer.parseInt(inputString);
        }
        catch(NumberFormatException ex)
        {
            System.out.println("Invalid string in argumment");
        }
//        finally
//        {
//           int a= 10;
//           System.out.println(a);
//        }
        String inputString ="2";
        int a= Integer.parseInt(inputString);
        System.out.println(a);
    }
}