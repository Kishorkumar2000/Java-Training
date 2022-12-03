import java.util.*;
//6. Create a linked list with list of colors from the user . Iterate over the list and
//
//        (i) Print it in the list-reverse order
//
//        (ii) Print the colors in alphabetical order
public class Linked
{
        public static void main(String[] args)
        {
            LinkedList<String> l = new LinkedList();
            LinkedList<String> reverse = new LinkedList();
            // use add() method to add values in the linked list
            l.add("Yellow");
            l.add("Blue");
            l.add("White");
            l.add("Red");
            l.add("Violet");
            l.add("Green");
            for (String element :l)
            {
                System.out.println(element);
            }
            System.out.println();
            l.sort(null);
            for (String element : l)
            {
                System.out.println(element);
            }
           // Iterator i = l.iterator();
//         for (Iterator i = l.iterator(); i.hasNext();)
//         {
//              reverse.add(l.pollLast());
//         }
            Collections.reverse(l);
          for (String element : l)
         {
            System.out.println(element);
         }
        }
    }

