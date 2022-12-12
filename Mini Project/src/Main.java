import java.sql.SQLException;
import java.util.Scanner;
import Staff.Staff;
import Staff.FindBestPerformer2;
//import Staff.Staff;
import Student.StudentLogin;
public class Main
{
    static boolean b = true;
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        System.out.println("\t****** Welcome to School Management System *******\n");
        System.out.println("Are you a Staff Or Student\n");
        System.out.println(" 1) Staff\n 2) Student\n");
        System.out.println("Please Select The Option\n");
        int select = s.nextInt();
        if (select == 1) {
            do {
                System.out.println(" \n\t****** Hearty Welcome Staff ******\n");
                System.out.println("Please Select Any Option\n");
                System.out.println(" 1) Add Student\n 2) Overall Best Performer\n 3) View Students Average\n 4) View Students Having More Than 5 Co-curricular Activities\n 5) View Students With High Percentage\n 6) Update Student\n 7) Delete The Student\n 8) Exit\n");
                int se = s.nextInt();
                switch (se) {
                    case 1:
                    {
                        Staff.StaffMethod();
                        break;
                    }
                    case 2:
                    {
                        FindBestPerformer2.BestPerformer();
                        break;
                    }
                    case 3:
                    {
                        FindBestPerformer2.BestPerformers();
                        break;
                    }
                    case 4:
                    {
                        FindBestPerformer2.displayCoCurricular();
                        break;
                    }
                    case 5:
                    {
                        FindBestPerformer2.Percentage();
                        break;
                    }
                    case 6:
                    {
                        Staff.staffUpdate();
                        break;
                    }
                    case 7:
                    {
                        Staff.deleteStudent();
                        break;
                    }
                    case 8:
                    {
                        b = false;
                        System.out.println("\t******** Thank You Staff Visit Again ********\n");
                        break;
                    }
                    default:
                        System.out.println("Invalid Input");
                }
            }
            while (b);
        }
        else if (select == 2)
        {
            if (StudentLogin.Entry())
            {
                //StudentLogin.Entry();
                do
                {
                    System.out.println(" \n\t ******** Welcome Beloved Student *******\n");
                    System.out.println("Please Select Any Option Shown Below\n");
                    System.out.println(" 1) Show My Details\n");
                    int se1 = s.nextInt();
                    switch (se1)
                    {
                        case 1:
                        {
                            StudentLogin.StudentLogin1();
                            b = false;
                            break;
                        }
//                        case 2:
//                        {
//                            b = false;
//                            System.out.println("\t ****** Hope You Had a Good Experience ******\n");
//                            break;
//                        }
                        default:
                            System.out.println("Invalid Input");
                    }
                }
                while (b);
            }
        }
    }
}
