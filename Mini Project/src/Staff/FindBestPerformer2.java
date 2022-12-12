package Staff;

import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
public class FindBestPerformer2 {
    static Scanner s = new Scanner(System.in);
    static int RollNo;
    static String SHOW_SQL = "select * From StudentAcademic";
    static String DataBase_URL = "jdbc:mysql://localhost:3306/School";
    static String User_Name = "root";
    static String Password = "28July2000($)";

    public static void BestPerformers() {
        boolean liked = true;
        String SHOW_SQL = "select * From StudentAcademic";
        String DataBase_URL = "jdbc:mysql://localhost:3306/School";
        String User_Name = "root";
        String Password = "28July2000($)";
        String Sql = "select * from StudentAcademic Where (No_Of_Cocurricular_Activities)>5";
        String average1 = "select avg(Maths+English+Biology+Chemistry+Physics)/5 from StudentAcademic where RollNo=1";
        String average2 = "select avg(Maths+English+Biology+Chemistry+Physics)/5 from StudentAcademic where RollNo=2";
        String average3 = "select avg(Maths+English+Biology+Chemistry+Physics)/5 from StudentAcademic where RollNo=3";
        String average4 = "select avg(Maths+English+Biology+Chemistry+Physics)/5 from StudentAcademic where RollNo=4";
        String average5 = "select avg(Maths+English+Biology+Chemistry+Physics)/5 from StudentAcademic where RollNo=5";
        String average6 = "select avg(Maths+English+Biology+Chemistry+Physics)/5 from StudentAcademic where RollNo=6";
//        displayCoCurricular();
//        BestPerformer();
        do {
            System.out.println("\t ******* Welcome To Best Student Identifier ******* \t\n");
            System.out.println("Enter the Roll No of the Student You need to see the Average of");
            System.out.println(" 1) Student 1\n 2) Student 2\n 3) Student 3\n 4) Student 4\n 5) Student 5\n 6) Student 6\n 7) Exit\n");
            RollNo = s.nextInt();
            switch (RollNo) {
                case 1: {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection(DataBase_URL, User_Name, Password);
                        ResultSet rs1 = conn.createStatement().executeQuery(average1);
                        if (rs1.next()) {
                            System.out.println("Average Of First Student is " + rs1.getFloat(1) + "%");
                            //PreparedStatement av = conn.prepareStatement("Insert Into StudentAcademic values (1, 'Kishorkumar', '2022', 98.0, 99.0, 95.0, 90.0, 92.0, 100, 'Excellent', 10, ?) ");
                            PreparedStatement av = conn.prepareStatement("Update StudentAcademic Set Average =? Where RollNo=1");
                            av.setFloat(1, rs1.getFloat(1));
                            System.out.println(av);
                            int i = av.executeUpdate();
                            System.out.println(i);
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                }
                case 2: {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection(DataBase_URL, User_Name, Password);
                        ResultSet rs2 = conn.createStatement().executeQuery(average2);
                        if (rs2.next()) {
                            System.out.println("Average Of Second Student is " + rs2.getFloat(1) + "%");
                            PreparedStatement av = conn.prepareStatement("Update StudentAcademic Set Average =? Where RollNo=2");
                            av.setFloat(1, rs2.getFloat(1));
                            System.out.println(av);
                            int i = av.executeUpdate();
                            System.out.println(i);
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                }
                case 3: {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection(DataBase_URL, User_Name, Password);
                        ResultSet rs3 = conn.createStatement().executeQuery(average3);
                        if (rs3.next()) {
                            System.out.println("Average Of Third Student is " + rs3.getFloat(1) + "%");
                            PreparedStatement av = conn.prepareStatement("Update StudentAcademic Set Average =? Where RollNo=3");
                            av.setFloat(1, rs3.getFloat(1));
                            System.out.println(av);
                            int i = av.executeUpdate();
                            System.out.println(i);
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                }
                case 4: {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection(DataBase_URL, User_Name, Password);
                        ResultSet rs4 = conn.createStatement().executeQuery(average4);
                        if (rs4.next()) {
                            System.out.println("Average Of Fourth Student is " + rs4.getFloat(1) + "%");
                            PreparedStatement av = conn.prepareStatement("Update StudentAcademic Set Average =? Where RollNo=4");
                            av.setFloat(1, rs4.getFloat(1));
                            System.out.println(av);
                            int i = av.executeUpdate();
                            System.out.println(i);
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                }
                case 5: {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection(DataBase_URL, User_Name, Password);
                        ResultSet rs5 = conn.createStatement().executeQuery(average5);
                        if (rs5.next()) {
                            System.out.println("Average Of Fifth Student is " + rs5.getFloat(1) + "%");
                            PreparedStatement av = conn.prepareStatement("Update StudentAcademic Set Average =? Where RollNo=5");
                            av.setFloat(1, rs5.getFloat(1));
                            System.out.println(av);
                            int i = av.executeUpdate();
                            System.out.println(i);
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                }
                case 6: {
                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection conn = DriverManager.getConnection(DataBase_URL, User_Name, Password);
                        ResultSet rs6 = conn.createStatement().executeQuery(average6);
                        if (rs6.next()) {
                            System.out.println("Average Of Sixth Student is " + rs6.getFloat(1) + "%");
                            PreparedStatement av = conn.prepareStatement("Update StudentAcademic Set Average =? Where RollNo=6");
                            av.setFloat(1, rs6.getFloat(1));
                            System.out.println(av);
                            int i = av.executeUpdate();
                            System.out.println(i);
                        }
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    break;
                }
                case 7: {
                    liked = false;
                    System.out.println("******** Hope You Got The Average For all the Students ********");
                }
                default:
                    System.out.println("Invalid Input");
            }
        }
        while (liked);
    }

    public static void displayCoCurricular() {
        String Sql = "select * from StudentAcademic Where (No_Of_Cocurricular_Activities)>5 ";
        try {
            System.out.println("\t ****** Students With More Than 5 Co Curricular Activities ******\n ");
            Connection conn = DriverManager.getConnection(DataBase_URL, User_Name, Password);
            ResultSet co = conn.createStatement().executeQuery(Sql);
            while (co.next()) {
                System.out.println(" Students Name With More Than 5 Co Curricular Activities : " + co.getString("Full_Name"));
            }
            /*PreparedStatement av = conn.prepareStatement("UPDATE StudentAcademic\n" +
                    "SET Average=?\n" +
                    "WHERE Roll_No= ?;\n");*/

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void BestPerformer() {
        String BestPerformer = "SELECT * FROM StudentAcademic ORDER BY Average Desc,Attendance_Percentage limit 3";
        try {
            System.out.println("\n\t ************* Welcome to the Best Performer Identifier Portal *********\n");
            Connection conn = DriverManager.getConnection(DataBase_URL, User_Name, Password);
            // PreparedStatement best= conn.prepareStatement(BestPerformer);
            ResultSet best = conn.createStatement().executeQuery(BestPerformer);

            //System.out.println(best);
            while (best.next()) {
                System.out.println("Top Best Performers : " + best.getString("Full_Name"));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void Percentage()
    {
        String Sql = "select * from StudentAcademic Where (Attendance_Percentage)>90";
        try {
            System.out.println("\t *********Welcome To Highest Percentage Founder *********\n");
            Connection conn = DriverManager.getConnection(DataBase_URL, User_Name, Password);
            ResultSet rs7 = conn.createStatement().executeQuery(Sql);
            while (rs7.next())
            {
                System.out.println("Students With More Than 90 % : "+ rs7.getString("Full_Name"));
            }
        }
        catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }

