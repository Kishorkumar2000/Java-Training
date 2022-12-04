import java.util.Scanner;

//5.Write a program to print multiples of m up to values which will be less than or equal to n.
public class Multiples_Of_3 {
    static Scanner s= new Scanner(System.in);
    public static void main(String [] args)
    {
        System.out.println("Enter the value of M");
        int m=s.nextInt();
        System.out.println("Enter the  value of N");
        int n= s.nextInt();
        //System.out.println(m+" ");
        for (int i=m; i<=n; i+=m)
        {
           // for (int j=0; j<n; j++)




                    System.out.println(i);


            //else

        }
        System.out.println("The value of M is greater than the value of end Limit N");
    }
    }

