package string;
/**
 * Sample Input:  Mohan Naidu
 * Sample Output: udiaN nahoM

 */
public class ReverseTheString {
	public static void main(String[] args)
	{
		String str = "Mohan Naidu Medarametla";

	//1. Using StringBuffer Class
		StringBuffer sbf = new StringBuffer(str);
		System.out.println(sbf.reverse());    

    //2. Using iterative method
		char[] strArray = str.toCharArray();
		String reverseString="";
		for (int i = strArray.length - 1; i >= 0; i--)
		{
			reverseString=reverseString+strArray[i];
		}
		System.out.println(reverseString);    

	//3. Using Recursive Method
		System.out.println(recursiveMethod(str));   
	}

	static String recursiveMethod(String str)
	{
		if ((null == str) || (str.length() <= 1))
		{
            return str;
		}
		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}
}
