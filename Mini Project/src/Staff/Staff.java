package Staff;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;
public class Staff {
    static Scanner s = new Scanner(System.in);
    static String DataBase_URL = "jdbc:mysql://localhost:3306/School";
    static String User_Name = "root";
    static String Password = "28July2000($)";

    public static void StaffMethod() {

        System.out.println("\t ******* Welcome to the Staff Portal ******** \t\n");
        System.out.println("Please Enter the Name of the Student That You Need To Add In the Student Portal");
        String Name = s.nextLine();
        System.out.println("Enter the Roll Number for the Student");
        int Roll_No = s.nextInt();
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
        long Contact_Number = s.nextLong();
        // String Inserted_SQL = "Insert Into StudentProfile values " + " Name, Roll_No, Date_Of_Birth, Date_Of_Joining, Address, Fathers_Name, Mothers_Name, Contact_Number ";
//                "('Kishorkumar', 1, 22, '2000-07-28', '2022-10-16', '79 Friends Nagar 6th Street Semmandalam Cuddalore' , " +
//                 "'Dhanabose', 'Rajeswari' , 6385691033 )";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DataBase_URL, User_Name, Password);
            System.out.println(conn);
            Statement s = conn.createStatement();
            //System.out.println(s.executeUpdate(Inserted_SQL));
            PreparedStatement stmt = conn.prepareStatement("insert into StudentProfile values(?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, Name);
            stmt.setInt(2, Roll_No);
            stmt.setInt(3, Age);
            stmt.setString(4, DateOfBirth);
            stmt.setString(5, Date_Of_Joining);
            stmt.setString(6, Address);
            stmt.setString(7, Fathers_Name);
            stmt.setString(8, Mothers_Name);
            stmt.setLong(9, Contact_Number);
            int i = stmt.executeUpdate();
            System.out.println(i);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void staffUpdate()
    {
        System.out.println("\t ******* Welcome to the Staff Update Portal ******** \t\n");
        System.out.println("Enter the Roll Number for the Student That You Want To Update");
        int Roll_No = s.nextInt();
        System.out.println("Please Enter the Name of the Student That You Need To Update In the Student Portal");
        String Name = s.next();
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
        long Contact_Number = s.nextLong();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DataBase_URL, User_Name, Password);
            System.out.println(conn);
            Statement s = conn.createStatement();
            PreparedStatement stmt = conn.prepareStatement("UPDATE StudentProfile SET Name=?, Age=?, Date_Of_Birth=?, Date_Of_Joining=?, Address=?, Fathers_Name=?, Mothers_Name=?, Contact_Number=? WHERE Roll_No= ?");
            stmt.setInt(9,Roll_No );
            stmt.setString(1, Name);
            stmt.setInt(2, Age);
            stmt.setString(3, DateOfBirth);
            stmt.setString(4, Date_Of_Joining);
            stmt.setString(5, Address);
            stmt.setString(6, Fathers_Name);
            stmt.setString(7, Mothers_Name);
            stmt.setLong(8, Contact_Number);
            int i = stmt.executeUpdate();
            System.out.println(i);
        } catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void deleteStudent()
    {
        System.out.println("\t ******* Welcome to the Staff Delete Portal ******** \t\n");
        System.out.println("Enter the Roll No Of The Student That You Want Remove From The Data");
        int Roll_No = s.nextInt();
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DataBase_URL, User_Name, Password);
            System.out.println(conn);
            Statement s = conn.createStatement();
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM StudentProfile WHERE Roll_No=?");
            stmt.setInt(1,Roll_No);
            int i = stmt.executeUpdate();
            System.out.println(i);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}











//        public static void MarkAdding()
//        {
//            String DataBase_URL= "jdbc:mysql://localhost:3306/School";
//            String User_Name = "root";
//            String Password= "28July2000($)";
//            System.out.println("\t ******** Welcome to The Student Mark Entry Portal **********\n");
//            System.out.println("Enter The Student Roll Number");
//            int RollNo=s.nextInt();
//            System.out.println("Enter Students Full Name");
//            String Full_Name=s.nextLine();
//            System.out.println("Enter The Students Year Of Study");
//            String Year_Of_Study= s.nextLine();
//            System.out.println("Enter Maths Mark Of the Student");
//            double Maths = s.nextDouble();
//            System.out.println("Enter English Mark Of the Student");
//            double English= s.nextDouble();
//            System.out.println("Enter Biology Mark Of the Student");
//            double Biology= s.nextDouble();
//            System.out.println("Enter Chemistry Mark Of the Student");
//            double Chemistry= s.nextDouble();
//            System.out.println("Enter Physics Mark Of the Student");
//            double Physics= s.nextDouble();
//            System.out.println("Enter the Attendance Percentage Of The Student");
//            int Attendance_Percentage= s.nextInt();
//            System.out.println("Enter the Academic Percentage Of The Student");
//            String Performance = s.nextLine();
//            System.out.println("Enter the Number Of Co-curricular Activities Done By the Student");
//            int No_Of_Cocurricular_Activities = s.nextInt();
//            try
//            {
//                Class.forName("com.mysql.cj.jdbc.Driver");
//                Connection conn= DriverManager.getConnection(DataBase_URL, User_Name, Password);
//                System.out.println(conn);
//                Statement s= conn.createStatement();
//                //System.out.println(s.executeUpdate(Inserted_SQL));
//                PreparedStatement stmt = conn.prepareStatement("insert into StudentAcademic values(?,?,?,?,?,?,?,?,?,?,?)");
//                stmt.setInt(1,RollNo);
//                stmt.setString(2,Full_Name);
//                stmt.setString(3,Year_Of_Study);
//                stmt.setDouble(4,Maths);
//                stmt.setDouble(5,English);
//                stmt.setDouble(6,Biology);
//                stmt.setDouble(7,Chemistry);
//                stmt.setDouble(8,Physics);
//                stmt.setInt(9,Attendance_Percentage);
//                stmt.setString(10, Performance);
//                stmt.setInt(11, No_Of_Cocurricular_Activities);
//                int i = stmt.executeUpdate();
//                System.out.println(i);
//            }
//            catch (Exception e)
//            {
//                System.out.println(e);
//            }
//        }
//}
//
