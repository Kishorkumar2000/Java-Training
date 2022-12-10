import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class FindBestPerformer
{
    static Scanner s= new Scanner(System.in);
    static int RollNo ;
    public static void main(String[]args)
    {
        boolean liked = true;
        String SHOW_SQL = "select * From StudentAcademics";
        String DataBase_URL= "jdbc:mysql://localhost:3306/School";
        String User_Name = "root";
        String Password= "28July2000($)";
        String Sql = "select * from StudentAcademics Where (No_Of_Cocurricular_Activities)>5";
        System.out.println("\t ******* Welcome To Best Student Identifier ******* \t\n");
        System.out.println("Enter the Roll No of the Student ");
        RollNo = s.nextInt();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection(DataBase_URL, User_Name, Password);
            //System.out.println(conn);
            Statement s= conn.createStatement();
            ResultSet rs = s.executeQuery(SHOW_SQL);
            //System.out.println(s.executeUpdate(Inserted_SQL));
            //PreparedStatement stmt1= conn.prepareStatement();
            PreparedStatement prep = conn.prepareStatement(Sql);
            ResultSet rs1 = conn.createStatement().executeQuery("select avg(Subject_Wise_Marks+Attendance_Percentage+No_Of_Cocurricular_Activities) from StudentAcademics where RollNo=1");
            if(rs1.next())
                    {
//                    if (prep..getInt("No_Of_Cocurricular_Activities")>5)
//                    {
                        System.out.println("Average Of First Student is " + rs1.getFloat(1));
                    }
//                }
            ResultSet rs2 = conn.createStatement().executeQuery("select avg(Subject_Wise_Marks+Attendance_Percentage+No_Of_Cocurricular_Activities) from StudentAcademics where RollNo=2");
            //rs1.getString("Full_Name");
            if(rs2.next())
                System.out.println("Average Of Second Student is " + rs2.getFloat(1));
            ResultSet rs3 = conn.createStatement().executeQuery("select avg(Subject_Wise_Marks+Attendance_Percentage+No_Of_Cocurricular_Activities) from StudentAcademics where RollNo=3");
            if(rs3.next())
                System.out.println("Average Third Student is " + rs3.getFloat(1));
            ResultSet rs4 = conn.createStatement().executeQuery("select avg(Subject_Wise_Marks+Attendance_Percentage+No_Of_Cocurricular_Activities) from StudentAcademics where RollNo=4");
            if(rs4.next())
                System.out.println("Average Fourth Student is " + rs4.getFloat(1));
            ResultSet rs5 = conn.createStatement().executeQuery("select avg(Subject_Wise_Marks+Attendance_Percentage+No_Of_Cocurricular_Activities) from StudentAcademics where RollNo=5");
            if(rs5.next())
                System.out.println("Average Fifth Student is " + rs5.getFloat(1));
//            ResultSet rs6 = conn.createStatement().executeQuery("select avg(Subject_Wise_Marks+Attendance_Percentage+No_Of_Cocurricular_Activities) from StudentAcademics where RollNo=6");
//            if(rs6.next())
//                System.out.println("Average Sixth Student is " + rs6.getFloat(1));
            //System.out.println(rs4.getString("Full_Name"));
//            if (rs1.getFloat(1)>rs2.getFloat(1))
//            {
//                System.out.println(rs.getInt(1));
////            }
//            if (rs1.getFloat(1)>rs2.getFloat(1))
//            {
//                System.out.println(rs1.getString(1));
//            }
//            if (liked == Sql.)
//            {
//                System.out.println(rs.getFloat(1));
//            }
//            if (liked==rs.getBoolean(Sql))
//            {
//                System.out.println("hi");
//            }
//            if (RollNo.equals(rs.getInt("RollNo"))
//            {
//                System.out.println(rs.getString("Full_Name"));
//            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
