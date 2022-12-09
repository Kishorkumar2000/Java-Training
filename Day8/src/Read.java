import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
// creating a class
public class Read
{
    // creating a main method
    public static void main( String[] args )
    {
        try
        {
            String data = "Tutorials Point is a best website in the world";// The content to be stored inside the file
            File f1 = new File("/Users/kishorkumard/Desktop/Day8/src/kishorkumarinputfile.txt.java");// File thats going
            // to add the value which is given
            if(!f1.exists()) //for checking is there any file that is exist before which  we are trying to create
            {
                f1.createNewFile();// will create a file
            }
            FileWriter fileWritter = new FileWriter(f1.getName(),true); //it will append the value
            BufferedWriter bw = new BufferedWriter(fileWritter);
            bw.write(data);// for writing the value into the file
            bw.close();
            System.out.println("Done");// it will print in console
        }
        catch(IOException e)// for catching the exception
        {
            e.printStackTrace();
        }
    }
}