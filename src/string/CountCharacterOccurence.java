package string;
/**
 * Sample Input:  I am Mohan Naidu Medarametla
 * Sample Output: Number of occurances of 'a' in given string:  6

 */

public class CountCharacterOccurence {

	    public static void main(String[] args)
	    {
	        String s = "I am Mohan Naidu Medarametla";
	        int count = s.length() - s.replace("a", "").length();
	        System.out.println("Number of occurances of 'a' in given string:  "+count);
	    }
	}
