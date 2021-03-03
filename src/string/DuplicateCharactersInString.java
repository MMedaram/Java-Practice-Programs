package string;
/**
 * Sample Input:  Java J2EE
 * Sample Output: a : 2,E : 2, J : 2
 */

import java.util.HashMap;
import java.util.Set;
 
class DuplicateCharactersInString
{
   private static void duplicateCharCount(String inputString)
    {
        HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray)
        {
            if(charCountMap.containsKey(c))
            {
                charCountMap.put(c, charCountMap.get(c)+1);
            }
            else
            {
                charCountMap.put(c, 1);
            }
        }
 
        System.out.println("Duplicate Characters In InputString Is ");

        Set<Character> charsInString = charCountMap.keySet();
        for (Character ch : charsInString)
        {
            if(charCountMap.get(ch) > 1)
            {
                System.out.println(ch +" : "+ charCountMap.get(ch));
            }
        }
    }
 
    public static void main(String[] args)
    {
       duplicateCharCount("Java J2EE");
     }
}