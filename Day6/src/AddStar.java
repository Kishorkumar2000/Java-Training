//4. Write a method that accepts array list of Strings as parameter, then perform
//
//        ð Add * (star) after every element in the list.
//
//        Eg: [hello, world] -> output : [hello, *, world, *]
//
//        ð Also, for a given search string , return the index of it.

import java.util.*;
public class AddStar
{
    static Scanner s = new Scanner(System.in);
    static ArrayList<String> al = new ArrayList<>();
    public static void main(String[] args)
    {
        //static ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < 2; i++)
        {
            System.out.println("Enter a string");
            String str = s.next();
            al.add(str);
            al.add("*");
        }
         System.out.println(al);
         System.out.println("Enter the string to search");
         String search = s.next();
         System.out.println("The given string is at the index: " + getIndex(al, search));
         s.close();
    }
    public static int getIndex(ArrayList<String> s, String search)
    {
        System.out.println(s.indexOf(search));
//        Object[] str = s.toArray();
        for (int i=0; i < s.size(); i++)
        {
            System.out.println(s.get(i)+","+search);
            if (s.get(i).compareTo(search)==0)
            {
                return i;
            }
        }
        return 0;
    }
}
