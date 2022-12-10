import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
public class FindBestPerformer1 {
    static Scanner s = new Scanner(System.in);
    static int RollNo;

    public static void main(String[] args) {
        boolean liked = true;
        String SHOW_SQL = "select * From StudentAcademic";
        String DataBase_URL = "jdbc:mysql://localhost:3306/School";
        String User_Name = "root";
        String Password = "28July2000($)";
        String Sql = "select * from StudentAcademic Where (No_Of_Cocurricular_Activities)>5";
        String average1 = "select avg(Maths+English+Biology+Chemistry+Physics) from StudentAcademic where RollNo=1";
        String average2 = "select avg(Maths+English+Biology+Chemistry+Physics) from StudentAcademic where RollNo=2";
        String average3 = "select avg(Maths+English+Biology+Chemistry+Physics) from StudentAcademic where RollNo=3";
        String average4 = "select avg(Maths+English+Biology+Chemistry+Physics) from StudentAcademic where RollNo=4";
        String average5 = "select avg(Maths+English+Biology+Chemistry+Physics) from StudentAcademic where RollNo=5";
        String average6 = "select avg(Maths+English+Biology+Chemistry+Physics) from StudentAcademic where RollNo=6";
        System.out.println("\t ******* Welcome To Best Student Identifier ******* \t\n");
        System.out.println("Enter the Roll No of the Student ");
        RollNo = s.nextInt();
                try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(DataBase_URL, User_Name, Password);
                    //System.out.println(conn);
                    Statement s = conn.createStatement();
                    ResultSet rs = s.executeQuery(SHOW_SQL);
                    // System.out.println(rs);
                    PreparedStatement prep = conn.prepareStatement(Sql);
                    //System.out.println(prep);
                    ResultSet rs1 = conn.createStatement().executeQuery(average1);
                    if (rs1.next()) {
                        System.out.println("Average Of First Student is " + rs1.getFloat(1));
                    }
                    ResultSet rs2 = conn.createStatement().executeQuery(average2);
                    if (rs2.next()) {
                        System.out.println("Average Of First Student is " + rs2.getFloat(1));
                    }
                    ResultSet rs3 = conn.createStatement().executeQuery(average3);
                    if (rs3.next()) {
                        System.out.println("Average Of First Student is " + rs3.getFloat(1));
                    }
                    ResultSet rs4 = conn.createStatement().executeQuery(average4);
                    if (rs4.next()) {
                        System.out.println("Average Of First Student is " + rs4.getFloat(1));
                    }
                    ResultSet rs5 = conn.createStatement().executeQuery(average5);
                    if (rs5.next()) {
                        System.out.println("Average Of First Student is " + rs5.getFloat(1));
                    }
                    ResultSet rs6 = conn.createStatement().executeQuery(average6);
                    if (rs6.next()) {
                        System.out.println("Average Of First Student is " + rs6.getFloat(1));
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
        }
    }


