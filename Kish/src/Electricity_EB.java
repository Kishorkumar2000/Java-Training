import java.util.Scanner;

//6.Develop a Java application to generate Electricity bill.
public class Electricity_EB {
    static Scanner s= new Scanner(System.in);
    static boolean b;
    public static void main(String[] args) throws Exception
    {
        b=true;
        do
        {
        System.out.println("\tWelcome to Electricity Connections Of India\t\n");
        System.out.println("Please Select the type of Connection\n");
        System.out.println(" 1) Domestic\n 2) Commercial\n 3) Exit\n");
        int type= s.nextInt();
        System.out.println("Enter the Number of Units Used");
        int num= s.nextInt();
        System.out.println("Processing Please Wait....\n");
        Thread.sleep(2000);
        switch (type)
        {
            case 1:
            {
                if (num<=100)
                {
                    int price= 1;
                    int bill=num*price;
                    System.out.println("The Price of your Electricity Bill was : Rs."+bill);
                }
                if (num>100 && num<=200)
                {
                    double price=2.50;
                    double bill = num*price;
                    System.out.println("The Price of your Electricity Bill was : Rs."+bill);
                }
                if (num>200 && num<=500)
                {
                    int price=4;
                    int bill=num*price;
                    System.out.println("The Price of your Electricity Bill was : Rs."+bill);
                }
                if (num>500)
                {
                    int price=6;
                    int bill=num*price;
                    System.out.println("The Price of your Electricity Bill was : Rs."+bill);
                }
                break;
            }
            case 2:
            {
                if (num<=100)
                {
                    int price= 2;
                    int bill=num*price;
                    System.out.println("The Price of your Electricity Bill was : Rs."+bill);
                }
                if (num>100 && num<=200)
                {
                    double price=4.50;
                    double bill = num*price;
                    System.out.println("The Price of your Electricity Bill was : Rs."+bill);
                }
                if (num>200 && num<=500)
                {
                    int price=6;
                    int bill=num*price;
                    System.out.println("The Price of your Electricity Bill was : Rs."+bill);
                }
                if (num>500)
                {
                    int price=7;
                    int bill=num*price;
                    System.out.println("The Price of your Electricity Bill was : Rs."+bill);
                }
                break;
            }
            case 3:
            {
                b=false;
                System.out.println("Lets Save Electricity Together\n");
                System.out.println(" Hope You had a Good Experience with us Thank You");
            }
        }
    }
        while(b);
}
    }
