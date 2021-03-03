package collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class SortByKeyExample {
	public static void main(String[] argv) {

		Map<String, Integer> unsortMap = new HashMap<>();
		unsortMap.put("jhon", 10);
		unsortMap.put("basha", 5);
		unsortMap.put("asha", 6);
		unsortMap.put("chandu", 20);
		unsortMap.put("dilli", 1);
		unsortMap.put("eight", 7);
		unsortMap.put("yello", 8);
		unsortMap.put("naidu", 99);
		unsortMap.put("gopi", 50);
		unsortMap.put("mohan", 2);
		unsortMap.put("first", 9);

		System.out.println("Original...");
		System.out.println(unsortMap);

		System.out.println("Sorted...");

		Map<String, Integer> treeMap = new TreeMap<String, Integer>(unsortMap);
        System.out.println(treeMap);

		// sort by keys, a,b,c..., and return a new LinkedHashMap
		// toMap() will returns HashMap by default, we need LinkedHashMap to keep the order.
//Comparator.reverseOrder()
        
		Map<String, Integer> result = unsortMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));

		System.out.println(result);

	}

}
