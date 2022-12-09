import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Repeat1
{
        public static void main(String[] args) throws Exception
        {

            Scanner sc=new Scanner(System.in);

//            System.out.println("Enter a sentence:");
//            String a=sc.nextLine();
            try(FileOutputStream output=new FileOutputStream("kishorkumaroutputfile.txt",true))
            {
                //byte[] strToBytes = a.getBytes();
                //output.write(strToBytes);
                FileInputStream fi= new FileInputStream("kishorkumarinputfile.txt");
                int i;
                while((i=fi.read())!=-1)
                {
                    output.write(i);
                }
            }
            catch (Exception e){
                System.out.println(e);
            }

        }
}
