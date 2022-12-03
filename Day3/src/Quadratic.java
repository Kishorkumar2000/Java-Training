import java.util.Scanner;

//4. Write a simple Java class for quadratic functions of the form f(x) = ax2 + bx + c.
public class Quadratic {
    static Scanner s = new Scanner(System.in);
    static int a, b, c;
    static int x;

    Quadratic() {
        a = 1;
        b = 1;
        c = 1;
    }

    Quadratic(int a, int b, int c) {
        System.out.println("Please Enter the value of X\n");
        x = s.nextInt();
        //System.out.println(a+" "+(x*x)+" " + b+" "+(x)+" "+ c);
        // int x= 1;
        System.out.print("f(" + x + ")" + "=");
        System.out.print(a * (x * x) + b * (x) + c);
    }

//    public static int Quadratic ( int a, int b, int c)
//    {
//        //System.out.println(a+" "+(x*x)+" " + b+""+(x)+" "+ c);
////        return 1;
////    }
    public static void main (String [] args)
    {
//       // System.out.println(a*(x*x) + b*(x)+ c);
////        a= 5;
////        b= 5;
////        c= 8;
        System.out.println("\tWelcome to Quadratic Equation\n");
        Quadratic object= new Quadratic(1,2,3);
    }
//
}