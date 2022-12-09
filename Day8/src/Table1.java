import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Table1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream a=new FileOutputStream("/Users/kishorkumard/Desktop/Day8/multiplicationtxt");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of M:");
        int m=sc.nextInt();
        int result=0;
        for(int i=1;i<=10;i++){
            result=m*i;
            String table=i + " * " + m + " = " + result+"\n";
            System.out.println(table);
            a.write(table.getBytes());
        }
    }
}
//stored in multiplication file