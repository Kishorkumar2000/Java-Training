package Student;

import javax.naming.Name;
import java.sql.*;
import  java.util.Scanner;
import java.sql.Connection;

public class StudentLogin {
    static Scanner s = new Scanner(System.in);
    static String Date_Of_Birth;
    static int Roll_No;

    public static void StudentLogin1() throws SQLException {
        try {
            String SHOW_SQL = "Select * From StudentProfile ";
            String DataBase_URL = "jdbc:mysql://localhost:3306/School";
            String User_Name = "root";
            String Password = "28July2000($)";
            Connection conn = DriverManager.getConnection(DataBase_URL, User_Name, Password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SHOW_SQL);
            System.out.println("\t ******** Welcome To Student Login Portal *********\t\n");
            System.out.println("Please Enter Your Date Of Birth");
            Date_Of_Birth = s.next();
            System.out.println("Please Enter Your Roll_No");
            Roll_No = s.nextInt();
            while (rs.next())
            {
                if (Date_Of_Birth.equals(rs.getDate("Date_Of_Birth").toString()))
                {
                    if (Roll_No == rs.getInt("Roll_No"))
                    {
                        System.out.println("\t ******* Details of the Student *******\n");
                        System.out.println("Name Of The Student :" + rs.getString("Name"));
                        System.out.println("Age of the Student is :" + rs.getInt("Age"));
                        System.out.println("Address of the Student : " + rs.getString("Address"));
                        System.out.println("Father's Name: " + rs.getString("Fathers_Name"));
                        System.out.println("Mother's Name :" + rs.getString("Mothers_Name"));
                        System.out.println("Contact Number :" + rs.getString("Contact_Number"));
                    } else {
                        System.out.println("Enter the valid Details");
                    }
                    // System.out.println(rs.getDate("Date_Of_Birth"));
//            System.out.println(rs.getString("Name")+" "+ rs.getString("Age"));
                }
                //PreparedStatement upd = conn.prepareStatement("SELECT * FROM library WHERE author =?'");
                //System.out.println(rs.getString(1));
            }
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static boolean Entry()
    {
        try
        {
            String SHOW_SQL = "Select * From StudentProfile ";
            String DataBase_URL = "jdbc:mysql://localhost:3306/School";
            String User_Name = "root";
            String Password = "28July2000($)";
            Connection conn = DriverManager.getConnection(DataBase_URL, User_Name, Password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SHOW_SQL);
            System.out.println("\t ******** Welcome To Student Login Portal *********\t\n");
            System.out.println("Please Enter Your Date Of Birth");
            Date_Of_Birth = s.next();
            System.out.println("Please Enter Your Roll_No");
            Roll_No = s.nextInt();
            boolean flag= false;
            while (rs.next())
            {
                if (Date_Of_Birth.equals(rs.getDate("Date_Of_Birth").toString()))
                {
                    if (Roll_No == rs.getInt("Roll_No")) {
                        System.out.println("Congratulation You are Now Logged In Successfully");
                        flag= true;
                        return true;
                    }
                }
            }
            if (flag==false)
            {
                System.out.println("Please Enter valid Details");
                return false;
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        return true;
    }
}

