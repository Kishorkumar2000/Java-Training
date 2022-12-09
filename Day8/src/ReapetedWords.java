// Java implementation of the above
// approach
//2. Prepare .txt file with multiple line of statements.
//
//        Find the frequency of words in document.
//
//        Sample input/output:
//
//        Sample.txt
//
//        This is apple.
//
//        This is orange.
//
//        Output:
//
//        This - 2
//
//        is - 2
//
//        apple - 1
//
//        orange – 1
import java.util.Map;
import java.util.TreeMap;
public class ReapetedWords
{
    // Function to count frequency of
    // words in the given string
    public static void count_freq(String str)
    {
        Map<String,Integer> mp=new TreeMap<>();
        // Splitting to find the word
        String arr[]=str.split(" ");
        // Loop to iterate over the words
        for(int i=0;i<arr.length;i++)
        {
            // Condition to check if the
            // array element is present
            // the hash-map
            if(mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i])+1);
            }
            else
            {
                mp.put(arr[i],1);
            }
        }
        // Loop to iterate over the
        // elements of the map
        for(Map.Entry<String,Integer> entry: mp.entrySet())
        {
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
    }
    // Driver Code
    public static void main(String[] args)
    {
        String str = "The More You Work The More You Achieve";
        // Function Call
        count_freq(str);
    }
}
