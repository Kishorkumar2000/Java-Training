import java.util.*;
//1.Get two floating values from console and do some arithmetic operations.
public
class Main
{
    static boolean b = true;
    static Scanner s= new Scanner(System.in);
    public static void main(String[] args)
    {
        //boolean b;
        do {
            System.out.println("\tWelcome to Arithmetic Operation\n");
            System.out.println("Please select the type of arithmetic Operation to be performed");
            System.out.println(" 1) Addition\n 2) Subtraction\n 3) Multiplication\n 4) Division\n 5) Modulus\n 6) Exit\n");
            float num1;
            float num2;


            int num;
            num = s.nextInt();
            switch (num) {
                case 1: {
                    System.out.println("Enter the First Number");
                    num1 = s.nextFloat();
                    System.out.println("Enter the Second Number");
                    num2 = s.nextFloat();
                    double add = num1 + num2;
                    System.out.println("The Addition of both numbers is :" + add);
                    break;
                }
                case 2: {
                    System.out.println("Enter the First Number");
                    num1 = s.nextFloat();
                    System.out.println("Enter the Second Number");
                    num2 = s.nextFloat();
                    double sub = num1 - num2;
                    System.out.println("The Subtraction of both numbers is :" + sub);
                    break;
                }
                case 3: {
                    System.out.println("Enter the First Number");
                    num1 = s.nextFloat();
                    System.out.println("Enter the Second Number");
                    num2 = s.nextFloat();
                    double mul = num1 * num2;
                    System.out.println("The Multiplication of two numbers is :" + mul);
                    break;
                }
                case 4: {
                    System.out.println("Enter the First Number");
                    num1 = s.nextFloat();
                    System.out.println("Enter the Second Number");
                    num2 = s.nextFloat();
                    double div = num1 / num2;
                    System.out.println("The Division of the both numbers is :" + div);
                    break;
                }
                case 5: {
                    System.out.println("Enter the First Number");
                    num1 = s.nextFloat();
                    System.out.println("Enter the Second Number");
                    num2 = s.nextFloat();
                    double mod = num1 % num2;
                    System.out.println("The Modulus of the both numbers is :" + mod);
                    break;
                }
                case 6: {
                    b = false;
                    System.out.println("***** Thank you Visit Again *****");

                }

            }
        }
        while (b);

    }
}