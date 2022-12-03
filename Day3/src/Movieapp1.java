import java.util.Scanner;

public class Movieapp1
{
    static Scanner s= new Scanner(System.in);
    static String moviename;
    static String Directorname;
    static int rating;
    static int rating1;
    static int rating2;
    static int rating3;
    static String movielist [];
    //static String movielist [] = {"Garfield", "Avengers", "Fast & Furious"};
    Movieapp1()
    {

    }
    Movieapp1(String moviename, String Directorname, int rating)
    {
        this.moviename=moviename;
        this.Directorname=Directorname;
        this.rating=rating;
    }
    public void getRating()
    {
//        int rating1;
//        int rating2;
//        int rating3;
        String movielist [] = {"Garfield", "Avengers", "Fast & Furious"};
        System.out.println("Please Give Rating for the Movie :"+movielist[0]);
        rating1 =s.nextInt();
        System.out.println("Please Give Rating for the Movie :"+movielist[1]);
        rating2 =s.nextInt();
        System.out.println("Please Give Rating for the Movie :"+movielist[2]);
        rating3 =s.nextInt();
        if (rating1>3)
        {
            System.out.println(movielist[0]);
        }
        if (rating2>3)
        {
            System.out.println(movielist[1]);
        }
        if (rating3>3)
        {
            System.out.println(movielist[2]);
        }
    }
     public void upperCase ()
     {
         for (int i=0; i<movielist.length; i++)
         {
             System.out.println(movielist[i].toUpperCase());
         }
     }
    public static void main(String [] args)
    {
        //String moviename, Directorname , rating;
        //String movielist [] [] = {{"Garfield","Kish","5"},{"Avengers","Director1","3"},{"Fast & Furious", "Director2","4"}};
        //  movielist [rating][moviename][] = {{5,"Garfield","Kish"},{"Avengers","Director1",3},{"Fast & Furious", "Director2","3.5"}};
        Movieapp1 object = new Movieapp1("Wakanda Forever", "Ryan Coogler", 4);
        Movieapp1 object1= new Movieapp1("Garfield","Kish",rating1);
        Movieapp1 object2= new Movieapp1("Avengers","George",rating2);
        Movieapp1 object3= new Movieapp1("Fast & Furious","Mike",rating3);
        //String movielist [] = {"Garfield", "Avengers", "Fast & Furious"};
        object.getRating();
        object.upperCase();


    }
}