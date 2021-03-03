package string;

/**
 * Sample Input:  I am Mohan Naidu Medarametla
 * Sample Output: Number of words in the string = 5
 */

public class CountTheNoOfWordsInString {
	
	public static void main(String[] args)
    {
        String s="I am Mohan Naidu Medarametla";
      //1. using length 
        String[] words = s.trim().split(" ");
        System.out.println("Number of words in the string = "+words.length);
      //2. loop
        int count = 1;
        for (int i = 0; i < s.length()-1; i++)
        {
            if((s.charAt(i) == ' ') && (s.charAt(i+1) != ' '))
            {
                count++;
            }
        }
         System.out.println("Number of words in the string = "+count);
    }

}
