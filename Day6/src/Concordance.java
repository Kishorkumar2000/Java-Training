//2. Write a program which creates a concordance of characters occurring in a string (i.e., which characters occur where in a string). Read the string from the user
//import java.lang.*;
//import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.Set;
//
////      Eg: Text : HELLO WORLD
//public class Concordance
//{
//    static Scanner s = new Scanner(System.in);
//    static int counter;
//
////    public static void main(String[] args)
////    {
////        indexOfChar("hi");
////    }
//
//    public static void main (String string) {
//        {
//            ArrayList<String> al = new ArrayList<String>();
//            System.out.println("Please enter any word");
//            String str = s.nextLine();
//            al.add(str);
//            int index=al.indexOf(str);
//            //ArrayList<String> letterCounter = new ArrayList<String>();
//            for (int i = 0; i < str.length(); i++)
//            {
//                counter = 0;
//                //String letter = null;
//               //System.out.println(indexOfChar(String.valueOf(al)));
//                //indexOfChar(str);
//                System.out.println(str.charAt(i));
//            }
//            //counter = 0;
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) != 0)
//                {
//                    counter++;
//                }
//            }
//        }
//    }
//}

import java.util.*;

class Test
{
   static Scanner s= new Scanner(System.in);
    public static HashMap<Character, Set<Integer>> characterConcordance(String input)
    {
        HashMap<Character, Set<Integer>> concordance = new HashMap<Character, Set<Integer>>();
        for (int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            // ignore spaces
            if (ch == ' ')
            {
                continue;
            }
            Set<Integer> s= concordance.get(ch);
            if (s == null)
            {
                s= new HashSet<Integer>();
            }
            s.add(i);
            concordance.put(ch, s);
        }
        return concordance;
    }
    public static void main(String[] args)
    {
        String input= s.nextLine();
        System.out.println(Test.characterConcordance(input));
    }
}
