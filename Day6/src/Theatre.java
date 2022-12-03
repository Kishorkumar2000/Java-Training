import java.util.ArrayList;

//1. Have a list of all theatres stored in one arraylist. Have another arraylist with the list of theatres that are closed. Compare these two arraylists and print the list of theatres that are open.
public class Theatre
{
    public static void main (String [] args)
    {
//        ArrayList al = new ArrayList();
        ArrayList <String> al1 = new ArrayList<String>();
        al1.add("Moon Star");
        al1.add("All In One");
        al1.add("Movie Mania");
        al1.add("Comfort View");
        al1.add("Luxury Theatre");
        al1.add("20s Theatre");
        ArrayList <String> closed = new ArrayList<String>();
        closed.add("Moon Star");
        closed.add("All In One");
        closed.add("20s Theatre");
//        ArrayList <String> opened = new ArrayList<String>();
//        opened.add("Movie Mania");
//        opened.add("Comfort View");
//        opened.add("Luxury Theatre");
//        al1.retainAll(closed);
//        System.out.println("The Closed Theatres are : "+al1);
        al1.removeAll(closed);
        System.out.println("The Opened Theatres are :"+al1);
//       al1.equals(closed);
//           System.out.println(al1);
//           System.out.println(closed);
//           al1.equals(closed);
//           System.out.println(al1);
//        if (al1.retainAll(closed));
//        {
//            System.out.println("The Closed Theatres are : "+al1);
//        }
//        if (al1.removeAll(closed))
//        {
//            System.out.println("The Opened Theatres are :"+ al1);
//        }
        //if (opened.retainAll(al1))
        //System.out.println("The Opened Theaters are :"+opened);

    }
}
