//3.print multiplication table of m upto 10 * m.
//
//        Sample input:
//
//        Enter value of m: 3
//
//        Sample output:
//
//        Multiplication.txt
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Files;
import java.io.FileOutputStream;
public class Table
{
        public static void main(String args[]) throws FileNotFoundException {
            Scanner s = new Scanner(System.in);
            System.out.print("Enter The Value Of M: ");
//reading a number whose table is to be print
            int m = s.nextInt();
//loop start execution form and execute until the condition i<=10 becomes false
            int se = 0;
            for (int i = 1; i <= 10; i++) {
//prints table of the entered number
                se = m * 1;
                System.out.println(i + " * " + m + " = " + m*i);
            }
            //FileInputStream file= new FileInputStream("multiplicationtxt.file");
            //FileOutputStream file1= new FileOutputStream("multiplicationtxt.file");
           // Path multiplicationtxt = Path.of("/Users/kishorkumard/Desktop");
            Path multiplication1txt = Path.of("multiplication1txt");
            //Files.writeString(multiplicationtxt,  );
            System.out.println(multiplication1txt);
        }
}

