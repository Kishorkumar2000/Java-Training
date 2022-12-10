import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;

public class MIni_Project
{
    public static void main(String [] args)
    {
        String DataBase_URL= "jdbc:mysql://localhost:3306/School";
        String User_Name = "root";
        String Password= "28July2000($)";
//        String Inserted_SQL = "Insert Into StudentProfile values " +
//                "('Kishorkumar', 1, 22, '2000-07-28', '2022-10-16', '79 Friends Nagar 6th Street Semmandalam Cuddalore' , " +
//                "'Dhanabose', 'Rajeswari' , 6385691033  )";
//        String Inserted_SQL = "Insert Into StudentProfile values " +
//                "('Pragadeesh', 2, 22, '2000-07-21', '2022-10-18', '79 Friends Nagar 6th Street Semmandalam Cuddalore' , " +
//                "'Dhanabose', 'Rajeswari' , 9790864512 )";
//        String Inserted_SQL = "Insert Into StudentProfile values " +
//                "('David', 3, 22, '2000-10-21', '2022-10-17', '123, 1st Street, Manly Street, Chennai' , " +
//                "'Milton', 'Diana' , 9874563921 )";
//        String Inserted_SQL = "Insert Into StudentProfile values " +
//                "('Emilia', 4, 22, '2000-09-01', '2022-10-11', 'Abc Street, 2nd Cross Street, Chennai' , " +
//                "'Mandy', 'Emy Jackson' , 8975534423 )";
//        String Inserted_SQL = "Insert Into StudentProfile values " +
//                "('Angelia', 5, 22, '2000-07-29', '2022-10-13', '7/2, 4th Street, 1st Main Road, Chennai ' , " +
//                "'Samuel', 'Handemiyy' , 6783098409 )";
//        String Inserted_SQL = "Insert Into StudentAcademic values " +
//                "( 1, 'Kishorkumar', '2022', 98, 99, 95, 90, 92, 100 , " +
//                "'Excellent', 10 )";
//        String Inserted_SQL = "Insert Into StudentAcademic values " +
//                "( 2, 'Pragadeesh', '2022', 99, 95, 97, 91, 88, 99 , " +
//                "'Outstanding', 8 )";
//        String Inserted_SQL = "Insert Into StudentAcademic values " +
//                "( 3, 'David', '2022', 65, 78, 61, 89, 70, 74 , " +
//                "'Not Bad', 2 )";
//        String Inserted_SQL = "Insert Into StudentAcademic values " +
//                "( 4, 'Emilia', '2022', 94, 79, 90, 81, 98, 89 , " +
//                "'very good', 7 )";
//        String Inserted_SQL = "Insert Into StudentAcademic values " +
//                "( 5, 'Angelia', '2022', 97, 94, 81, 76, 99, 91 , " +
//                "'Good', 6 )";
        String Inserted_SQL = "Insert Into StudentAcademic values " +
                "( 6, 'Jennifer', '2022', 91, 90, 87, 91, 85, 84 , " +
                "'Excellent', 7)";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection(DataBase_URL, User_Name, Password);
            System.out.println(conn);
            Statement s= conn.createStatement();
            System.out.println(s.executeUpdate(Inserted_SQL));
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
