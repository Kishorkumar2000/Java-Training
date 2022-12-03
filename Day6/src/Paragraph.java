import java.util.*;
//3. Write a program that takes in a paragraph (3-4 lines) as input, then (use the concept of ArrayList)
//
//        è Displays words of the paragraph as a list
//
//        è Displays the words in reverse order (Reverse the paragraph)
//
//        è Capitalize all plural words (Just words ending with “s”)
//
//        è Remove all words that are of odd length in the paragraph and display
public class Paragraph {
    static Scanner s = new Scanner(System.in);
    static ArrayList<String> words = new ArrayList<>();

    public static void main(String[] arg) {
        String str;
        System.out.print("\t Please Type Your Paragraph ");
        while (s.hasNext()) {
            str = s.next();
            if (str.equals("q"))
            {
                break;
            }
            //  System.out.println(str);
            words.add(str);
        }
        System.out.println(words);
        // System.out.println(Arrays.toString(words));
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).endsWith("s"))
            {
                words.set(i, words.get(i).toUpperCase());
            }
//                int y=1;
//                y+=2;
//                for (int y=1; ;y+=2)
//                {
//                    System.out.println(str.replace(""));
//                }
//            }
//            for (Iterator i = reverse.iterator(); i.hasNext();)
//            {
//                reverse.add(reverse.pollLast());
            // }
            //System.out.println(Arrays.toString(words));
            ArrayList<String> Updatedwords = new ArrayList<String>();
            Updatedwords.addAll(words);
            for (String s : words) {
                System.out.println(s.length());
                if (s.length() % 2 != 0) {
                    System.out.println("hi");
                    Updatedwords.remove(s);
                    System.out.println("y");
                }
            }
            System.out.println(Updatedwords);
        }
    }
}


