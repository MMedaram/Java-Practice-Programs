package collections.ListInterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingListObjects {

	public static void main(String[] args) {
        List<String> list = Arrays.asList("9", "A", "Z", "1", "B", "Y", "4", "a", "c");
        
        
		//List<String> sortedList = list.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());

       // List<String> sortedList = list.stream().sorted((o1,o2)-> o1.compareTo(o2)).collect(Collectors.toList());
		
		// List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
		
		List<String> sortedList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
       
		System.out.println(sortedList);

	}
}
