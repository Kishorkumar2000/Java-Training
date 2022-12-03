import java.security.Key;
import java.util.*;
//5. Use HashMap to implement the following. Get the input map from the user
//
//        HashMap values – {Bread = Butter, Pen = Pencil, Tall = Short, Big = Small}
//
//        Search string: Pencil
//
//        Output : Yes
//
//        Search string: Sketch
//
//        Output : No
//
//        Search string: 123
//
//        Output : Wrong input
public class Search
{
        static Scanner s=new Scanner(System.in);
        static int input1;
        public static void main(String[] args)
        {
            HashMap<String, String> Hm= new HashMap<String, String>();
            System.out.println("Please Enter the Word You need To Search");
            String input=s.nextLine();
            int integer = 123;
             //input1 =s.nextInt();
            // Mapping string values to int keys
            Hm.put("Bread","Butter");
            Hm.put("Pen","Pencil");
            Hm.put("Tall","Short");
            Hm.put("Big","Small");
            System.out.println("Search String :"+input);
            if(Hm.containsValue(input))
            {
                System.out.println("yes");
            }
                else
                    System.out.println("no");
            //String s = s.next();
                try {
                        Integer i = Integer.parseInt(input);
                        System.out.println("Wrong Input");
            } catch (Exception e)
                {
                    System.out.println(e);
                }
//            try
//            {
////                    if (Integer.parseInt(input)
////                    {
////
////                    }
//                if(input.equals(integer))
//                {
//                    return;
//                }
//            }
//                catch (Exception e)
//                {
//                    System.out.println("Wrong Input");
//                }
   }
}

