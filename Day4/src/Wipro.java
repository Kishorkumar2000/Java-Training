//2. Create an inheritance functionality of Wipro:

//WiproTech, WiproInfo, WiproBPO.

//In the base class, provide all the methods that are common to all Wipro, and override these in the derived classes to perform different behaviors depending on the specific type of Wipro.

//Think of different aspects and provide the behavior of different Wipro ventures.

//Implement a payroll system for employees of Wipro with varying pay in each of the ventures ie (WiproTech, WiproInfo, WiproBPO)
public class Wipro
{
    static String Employeename;
    static String Department;
    static int Employee_ID;
    static  double Salary;
    Wipro()
    {

    }
    Wipro(String Employeename, String Department, int Employee_ID, double Salary)
    {
        this.Employeename=Employeename;
        this.Department=Department;
        this.Employee_ID=Employee_ID;
        this.Salary=Salary;
    }
    public void detailsOfEmployee()
    {
        System.out.println("\nThe Employee Name is :"+Employeename);
        System.out.println("The Department od Employee is :"+Department);
        System.out.println("The Employee ID is :"+Employee_ID);
        System.out.println("The Salary of Employee is :"+Salary+"LPA\n");
    }
    public static class WiproTech extends Wipro
    {
        WiproTech()
        {

        }
        WiproTech(String Employeename, String Department, int Employee_ID, double Salary)
        {
            this.Employeename=Employeename;
            this.Department=Department;
            this.Employee_ID=Employee_ID;
            this.Salary=Salary;
        }
        public void detailsOfWiproTechEmployee()
        {
            System.out.println("The Employee Name is :"+Employeename);
            System.out.println("The Department od Employee is :"+Department);
            System.out.println("The Employee ID is :"+Employee_ID);
            System.out.println("The Salary of Employee is :"+Salary+"LPA\n");
        }
        public static class WiproInfo extends Wipro
        {
            WiproInfo()
            {

            }
            WiproInfo(String Employeename, String Department, int Employee_ID, double Salary)
            {
                this.Employeename=Employeename;
                this.Department=Department;
                this.Employee_ID=Employee_ID;
                this.Salary=Salary;
            }
            public void detailsOfWiproInfoEmployee()
            {
                System.out.println("The Employee Name is :"+Employeename);
                System.out.println("The Department od Employee is :"+Department);
                System.out.println("The Employee ID is :"+Employee_ID);
                System.out.println("The Salary of Employee is :"+Salary+"LPA\n");
            }
            public static class WiproBPO extends Wipro
            {
                WiproBPO()
                {

                }
                WiproBPO(String Employeename, String Department, int Employee_ID, double Salary)
                {
                    this.Employeename=Employeename;
                    this.Department=Department;
                    this.Employee_ID=Employee_ID;
                    this.Salary=Salary;
                }
                public void detailsOfWiproBPOEmployee()
                {
                    System.out.println("The Employee Name is :"+Employeename);
                    System.out.println("The Department od Employee is :"+Department);
                    System.out.println("The Employee ID is :"+Employee_ID);
                    System.out.println("The Salary of Employee is :"+Salary+"LPA\n");
                }
            }
        }
    }
}