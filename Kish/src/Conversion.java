import java.util.Scanner;

//b. Develop a Java application to implement distance converter(meter to KM and vice versa) using methods.
public class Conversion {
       static Scanner s = new Scanner(System.in);
       static int meter;
       static double kilometer;
       static boolean b = true;

       public static void main(String[] args) {
              do {
                     System.out.println("\tWelcome to Distance Convertor\n");
                     System.out.println("Please Select the Conversion Method\n");
                     System.out.println(" 1) Meter to Kilometer\n 2) Kilometer to Meter\n 3) Exit\n");
                     int conv = s.nextInt();
                     switch (conv) {
                            case 1: {
                                   meter = 1;
                                   kilometer = 0.001;
                                   System.out.println("Please Enter the meter value that want to be converted to kilometer");
                                   int res = s.nextInt();
                                   double mtok = res * kilometer;
                                   System.out.println("The Conversion of meter " + res + " m is :" + mtok + "km");
                                   break;
                            }
                            case 2: {
                                   kilometer = 1;
                                   meter = 1000;
                                   System.out.println("Please Enter the Number of Kilometer that needs to be Converted to Meter");
                                   int res1 = s.nextInt();
                                   int ktom = res1 * meter;
                                   System.out.println("The Conversion of kilometer " + res1 + " km is :" + ktom + "m");
                                   break;
                            }
                            case 3: {
                                   b = false;
                                   System.out.println((char) 2 + "Hope You Had a Good Experience" + (char) 2 + "\n" + (char) 5 + " Visit Again " + (char) 5);
                                   break;
                            }

                     }

              }
              while (b);
       }
}
