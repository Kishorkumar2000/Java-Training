//5) Replace any underscore in the string that user gives with a space.
public class Remove_Underscore
{
    public static void main (String [] args)
    {
        String input = "I_am_Kishor_kumar_From_QA";
        String output;
        output= input.replaceAll("_", " ");
        System.out.println("The Output of the string After Removing Underscores :"+output);
    }
}
