package string;
/**
 * Sample Input:  Mohan  Naidu  Medarametla
 * Sample Output: MohanNaiduMedarametla
 */
 //If you want to remove white spaces from inputString using inputString.replaceAll("\\s+", "") (Built in function)
 
public class RemoveWhiteSpacesInString {
	public static void main(String[] args) 
    {
        String inputString = "Mohan  Naidu  Medarametla";
        char[] charArray = inputString.toCharArray();
        String stringWithoutSpaces = "";

        for (char c :charArray) 
        {
            if ( (c != ' ') && (c != '\t') )
            {
                stringWithoutSpaces = stringWithoutSpaces + c;
            }
        }
        System.out.println("Input String Without Spaces: "+stringWithoutSpaces);
     }
}