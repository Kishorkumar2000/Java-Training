
//4. Write a program that reads two filenames from the command line and copies the contents of first file into the second file.
// Java program to copy content from one file to another

import java.io.*;
import java.util.*;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.PrintWriter;
public class ReadFileNames1
{
    static  PrintWriter pw = null;
    public static void copyContent(File a, FileWriter b) throws Exception
    {
        FileInputStream in = new FileInputStream(a);
        FileWriter out=new FileWriter(String.valueOf(b));
        //FileOutputStream out = new FileOutputStream(b);
        try
        {
            int n;
            // read() function to read the byte of data
            while ((n = in.read()) != -1)
            {
                // write() function to write the byte of data
                out.write(n);
            }
        }
        finally
        {
            if (in != null)
            {
                // close() function to close the
                // stream
                in.close();
            }
            // close() function to close the stream
            if (out != null)
            {
                out.close();
            }
        }
        System.out.println("File Copied");
    }
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        // get the source file name
        System.out.println("Enter the source filename from where you have to read/copy :");
        String a = sc.nextLine();
        // source file
        File x = new File(a);
        // get the destination file name
        System.out.println("Enter the destination filename where you have to write/paste :");
        String b = sc.nextLine();
        // destination file
       // File y = new File(b);
        FileWriter y = new FileWriter("kishorkumaroutputfile.txt",true);
        // method called to copy the contents from x to y
        copyContent(x, y);

    }
}
