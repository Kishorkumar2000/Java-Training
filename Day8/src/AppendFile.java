//5. Have a .txt file that already has some contents in it. Take a sentence as input from the user. Append the sentence to the file content.
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLOutput;
import java.util.Scanner;

/** * How to append data to a file in Java using FileReader.
 * @author kishorkumard
 * @since 2000
 * @version 100.0
 */
public class AppendFile
{
    static Scanner s= new Scanner(System.in);
    public static void main(String args[]) throws IOException
    {
        // We have a file names.txt which already contain two names, now we need to append couple of more names onto it.here is how it looks like now
        // names.txt
        // James
        // Hobert
        // In order to append text to a file, you need to open file into append mode, you do it by using FileReader and passing append = true
        FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;
        try
        {
            fw = new FileWriter("names.txt", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);
            System.out.println("Please Enter the First Content That needs to be appended");
            pw.println(s.nextLine());
            System.out.println("Please Enter the Second Content That needs to be appended");
            pw.println(s.nextLine());
            //pw.println("Ben");
            //System.out.println("Data Successfully appended into file");
            pw.flush();
        }
        finally
        {
            try
        {
            pw.close();
            bw.close();
            fw.close();
        }
        catch (IOException io)
        {
            // can't do anything
        }
        }
        // in Java 7 you can do it easily using try-with-resource statement as shown below
        try (FileWriter f = new FileWriter("names.txt", true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);)
        {
           // p.println("appending text into file");
            System.out.println("Enter the next String");
            p.println(s.nextLine());
            System.out.println("Enter the next String");
            p.println(s.nextLine());
            System.out.println("Data Successfully appended into file");
        }
        catch (IOException i)
        {
            i.printStackTrace();
        }
    }
}
//got input from user