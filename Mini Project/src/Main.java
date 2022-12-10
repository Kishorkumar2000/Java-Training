import java.sql.SQLException;
import java.util.Scanner;
import Staff.Staff;
import Staff.FindBestPerformer2;
//import Staff.Staff;
import Student.StudentLogin;
public class Main {
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
                System.out.println(" 1) Add Student\n 2) Find Best Performer\n 3) View Students Average\n 4) View Students Having More Than 5 Co-curricular Activities\n 5) Exit\n");
                int se = s.nextInt();
                switch (se) {
                    case 1: {
                        Staff.StaffMethod();
                        break;
                    }
                    case 2: {
                        FindBestPerformer2.BestPerformer();
                        break;
                    }
                    case 3: {
                        FindBestPerformer2.BestPerformers();
                        break;
                    }
                    case 4: {
                        FindBestPerformer2.displayCoCurricular();
                        break;
                    }
                    case 5: {
                        b = false;
                        System.out.println("\t******** Thank You Staff Visit Again ********\n");
                    }
                }
            }
            while (b);
        } else if (select == 2)
        {
            if (StudentLogin.Entry())
            {
                //StudentLogin.Entry();
                do
                {
                    System.out.println(" \n\t ******** Welcome Beloved Student *******\n");
                    System.out.println("Please Select Any Option Shown Below\n");
                    System.out.println(" 1) Show My Details\n 2) Exit\n");
                    int se1 = s.nextInt();
                    switch (se1)
                    {
                        case 1:
                        {
                            StudentLogin.StudentLogin1();
                            break;
                        }
                        case 2:
                        {
                            b = false;
                            System.out.println("\t ****** Hope You Had a Good Experience ******\n");
                        }
                    }
                }
                while (b);
            }
        }
    }
}
