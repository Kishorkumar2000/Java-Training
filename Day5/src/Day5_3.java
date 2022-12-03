import java.util.InputMismatchException;
import java.util.Scanner;
public class Day5_3
{
    static Scanner sc = new Scanner(System.in);
    static int num;
    static int div;
    public static void main(String[] args)
    {
        for (int i = 0; ; i++)
        {
//            System.out.println("Enter a numerator: ");
//            int num = sc.nextInt();
//            System.out.println("Enter a divisor: ");
//            int div = sc.nextInt();
            try
            {
                System.out.println("Enter a numerator: ");
                int num = sc.nextInt();
                System.out.println("Enter a divisor: ");
                int div = sc.nextInt();
                if (num == 'Q' || num == 'q')
                {
//                    System.out.println("Enter a numerator: ");
//                    int num = sc.nextInt();
//                    System.out.println("Enter a divisor: ");
//                    int div = sc.nextInt();
                    System.out.println("End");
                    break;
                }
                System.out.println(num / div);
            }
            catch (InputMismatchException ie)
            {
                System.out.println("Handled");
                break;
            }
            catch (Exception e)
            {
                System.out.println("Poor Input Data");
            }
        }
        sc.close();
    }
}



