import java.util.Scanner;

//3.Write java program to print day of week using switch case
public class Day_Of_Week {
    static Scanner s= new Scanner(System.in);
    static boolean b;
    public static void main(String[] args)
    {
        b=true;
        do {
            System.out.println((char)3+"\tWelcome to My Calender\t"+(char)3+"\n");
            System.out.println("Please Select the Number of the day you want to know");
            System.out.println(" 1) Day 1\n 2) Day 2\n 3) Day 3\n 4) Day 4\n 5) Day 5\n 6) Day 6\n 7) Day 7\n 8) Exit\n");
            int n = s.nextInt();
            switch (n) {
                case 1: {
                    System.out.println("Day one of the week is \"Monday\"\n");
                    break;
                }
                case 2: {
                    System.out.println("Day two of the week is \"Tuesday\"\n");
                    break;
                }
                case 3: {
                    System.out.println("Day three of the week is \"Wednesday\"\n");
                    break;
                }
                case 4: {
                    System.out.println("Day four of the week is \"Thursday\"\n");
                    break;
                }
                case 5: {
                    System.out.println("Day five of the week is \"Friday\"\n");
                    break;
                }
                case 6: {
                    System.out.println("Day six of the week is \"Saturday\"\n");
                    break;
                }
                case 7: {
                    System.out.println("Day seven of the week is \"Sunday\"\n");
                    break;
                }
                case 8: {
                    b = false;
                    System.out.println((char) 1 + "\tHope You had a good experience with MY Calender\t" + (char) 1);
                }
            }
        }
            while (b);

    }
}
