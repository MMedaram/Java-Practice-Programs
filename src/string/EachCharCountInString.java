package string;
/**
 * Sample Input:  "JavA J2EE Java JSP J2EE"
 * Sample Output: { =4, P=1, a=3, A=1, 2=2, S=1, E=4, v=2, J=5}
 */
 // If you don’t want to count white spaces then remove white spaces from inputString using inputString.replaceAll("\\s+", "")
 
import java.util.HashMap;
public class EachCharCountInString
{
    private static void characterCount(String inputString)
    {
        //Creating a HashMap containing char as a key and occurrences as a value
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        //Converting given string to char array
        char[] strArray = inputString.toCharArray();
        //checking each char of strArray
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                //If char 'c' is present in charCountMap, incrementing it's count by 1
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                //If char 'c' is not present in charCountMap, putting 'c' into charCountMap with 1 as it's value
                  charCountMap.put(c, 1);
            }
        }
         //Printing inputString and charCountMap 
         System.out.println(inputString+" : "+charCountMap);
    }
 
    public static void main(String[] args)
    {
      characterCount("JavA J2EE Java JSP J2EE");
     }
}