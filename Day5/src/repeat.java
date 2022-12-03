import java.util.Scanner;
public class repeat
{
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        for (int i = 0; ; i++)
        {
            System.out.println("Enter a numerator: ");
            int num = sc.nextInt();
            System.out.println("Enter a divisor: ");
            int div = sc.nextInt();
            try
            {
                if (num == 'Q' || num == 'q')
                {
                    System.out.println("End");
                    break;
                }
                System.out.println(num / div);
            }
            catch (Exception e)
            {
                System.out.println("Poor Input Data");
            }
        }
        sc.close();
    }
}



