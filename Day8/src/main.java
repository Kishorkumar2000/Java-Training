//1. Create txt file, read the contents and print in the console
import java.io.BufferedInputStream;
import java.io.FileInputStream;

class main
{
    public static void main(String[] args)
    {
        try
        {
            // Creates a FileInputStream
            FileInputStream file = new FileInputStream("kish.txt");
            // Creates a BufferedInputStream
            BufferedInputStream input = new BufferedInputStream(file);
            // Reads first byte from file
            int i = input .read();
            while (i != -1)
            {
                System.out.print((char) i);
                // Reads next byte from the file
                i = input.read();
            }
            input.close();
        }
        catch (Exception e)
        {
            e.getStackTrace();
        }
    }
}