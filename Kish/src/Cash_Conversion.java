import java.util.Scanner;

//c. Develop a Java application to implement currency converter (Dollar to INR) using methods.
public class Cash_Conversion {
    static Scanner s = new Scanner(System.in);
    static int INR;
    static int dollar;
    static boolean b = true;

    public static void main(String[] args) {
        do {
            System.out.println("\tWelcome to Currency Convertor\n");
            System.out.println("Please select the currency to be converted");
            System.out.println(" 1) Dollar to INR\n 2) INR to Dollar\n 3)Exit\n");
            int currency = s.nextInt();
            //System.out.println("Please Enter the number of amount that You need to convert");
            // int amount = s.nextInt();
            //System.out.println();
            switch (currency) {
                case 1: {
                    dollar = 80;
                    System.out.println("Please Enter the number of Dollars that You need to convert to INR");
                    int amount = s.nextInt();
                    int total = dollar * amount;
                    System.out.println("The Conversion of " + amount + " $ is :  Rs." + total);
                    break;
                }
                case 2: {
                    INR = 1;
                    System.out.println("Please Enter the number of INRs that You need to convert to Dollars");
                    int amount1 = s.nextInt();
                    double dollar2 = 0.012* amount1;
                    double total1 = INR * dollar2;
                    System.out.println("The Conversion of RS. " + amount1 + " is :  $" + total1);
                    break;
                }
                case 3: {
                    b = false;
                    System.out.println((char) 2 + "Hope You Had a Good Experience" + (char) 2 + "\n" + (char) 5 + " Visit Again " + (char) 5);
                }
            }
        }
        while (b);
    }
}

