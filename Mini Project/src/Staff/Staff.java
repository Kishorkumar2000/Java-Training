package Staff;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
public class Staff
{
    static Scanner s= new Scanner(System.in);
        public static void StaffMethod()
        {
            String DataBase_URL= "jdbc:mysql://localhost:3306/School";
            String User_Name = "root";
            String Password= "28July2000($)";
            System.out.println("\t ******* Welcome to the Staff Portal ******** \t\n");
            System.out.println("Please Enter the Name of the Student That You Need To Add In the Student Portal");
            String Name = s.nextLine();
            System.out.println("Enter the Roll Number for the Student");
            int Roll_No= s.nextInt();
            System.out.println("Enter The Age Of The Student");
            int Age = s.nextInt();
            System.out.println("Enter The Date Of Birth Of the Student");
            String DateOfBirth = s.next();
            System.out.println("Enter The Students Joining Date");
            String Date_Of_Joining = s.next();
            s.nextLine();
            System.out.println("Enter the Students Address");
            String Address = s.nextLine();
            System.out.println("Enter The Student Father's Name");
            String Fathers_Name = s.next();
            System.out.println("Enter The Student Mother's Name");
            String Mothers_Name = s.next();
            System.out.println("Enter The Students Contact Number");
            long Contact_Number =s.nextLong();
           // String Inserted_SQL = "Insert Into StudentProfile values " + " Name, Roll_No, Date_Of_Birth, Date_Of_Joining, Address, Fathers_Name, Mothers_Name, Contact_Number ";
//                "('Kishorkumar', 1, 22, '2000-07-28', '2022-10-16', '79 Friends Nagar 6th Street Semmandalam Cuddalore' , " +
//                 "'Dhanabose', 'Rajeswari' , 6385691033 )";
            try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn= DriverManager.getConnection(DataBase_URL, User_Name, Password);
                System.out.println(conn);
                Statement s= conn.createStatement();
                //System.out.println(s.executeUpdate(Inserted_SQL));
                PreparedStatement stmt = conn.prepareStatement("insert into StudentProfile values(?,?,?,?,?,?,?,?,?)");
                stmt.setString(1,Name);
                stmt.setInt(2,Roll_No);
                stmt.setInt(3,Age);
                stmt.setString(4,DateOfBirth);
                stmt.setString(5,Date_Of_Joining);
                stmt.setString(6,Address);
                stmt.setString(7,Fathers_Name);
                stmt.setString(8,Mothers_Name);
                stmt.setLong(9,Contact_Number);
                int i = stmt.executeUpdate();
                System.out.println(i);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
}
