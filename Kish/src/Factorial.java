import java.util.Scanner;

//4.Write a program to find the factorial value of any number;
public class Factorial
{
    static Scanner s= new Scanner(System.in);
    public static void main(String [] args)
    {
        int factorial=1;
        int number;
        System.out.println("\nPlease Enter the Number that you need to know the factorial for\n");
        number = s.nextInt();
        for (int i= 1; i<=number; i++)
        {
            factorial *=i;
        }
        System.out.println("THe Factorial for the Entered Number is : "+factorial);
    }
}
