package streamsj8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingMethod {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
        
		names.add("David");
		         
		names.add("Johnson");
		         
		names.add("Samontika");
		         
		names.add("Brijesh");
		         
		names.add("John");
		         
		//Sorting the names according to natural order
		names.stream().sorted().forEach(System.out::println);
	
		//Sorting the names in reverse order
		names.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//Sorting the names according to the length
		names.stream().sorted((String s,String s1)->s.length()-s1.length()).forEach(System.out::println);
				

	}
}
