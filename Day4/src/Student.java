//1. Create a class Student consisting of name and rollno as members. Create a class exam inheriting student.
// It can have marks for 3 subjects. Create a class result inheriting exam containing total_mark as member and
// a function to calculate the total_mark.
public class Student
{
    static String name ;
    static int rollno;
    Student()
    {
    }
    static void details()
    {
        name = "Kish";
        rollno=1;
        System.out.println("The Name of the Student is :"+name);
        System.out.println("The Roll No of the Student is :"+rollno);

    }
}
class Exam extends Student
{
    // static double total_marks;
    static double English = 99;
    static double Maths = 100;
    static double Science = 99.9;
    Exam()
    {

    }
    static void details()
    {
        English = 99;
        Maths = 100;
        Science = 99.9;
        System.out.println("English Mark of the Student is :"+English);
        System.out.println("Maths Mark of the Student is :"+Maths);
        System.out.println("Science Mark of the Student is :"+Science);
    }
//            public static void main (String [] args)
//            {
//                total_marks = English + Maths + Science;
//            }
}
class Result extends Exam {
    static double total_marks;

    Result()
    {

    }
    public static void main(String[] args)
    {
        Student object= new Student();
        object.details();
        Exam object2= new Exam();
        object2.details();
        total_marks= Exam.English+Exam.Maths+Exam.Science;
        System.out.println("The Total Marks of the Student is : "+total_marks);
    }
}
