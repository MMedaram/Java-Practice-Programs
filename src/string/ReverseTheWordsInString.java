package string;
/**
 * Sample Input:  Mohan Naidu Medarametla
 * Sample Output: Medarametla Naidu Mohan
 */
public class ReverseTheWordsInString {
	
	public static void main(String[] args) {
		
		String s = "Mohan Naidu Medarametla";

		String [] words= s.split(" ");
		String  outputWords = " ";	
		for(int i=words.length-1; i>=0;i--){
			outputWords=outputWords+words[i];
		}
		System.out.println(outputWords);
	}
	
}
