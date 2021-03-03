package collections.ListInterface;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class FindingDuplicateElementsFromTwoArrayLists {
	public static void main(String[] args) {
	ArrayList<String> list1=new ArrayList<String>();
	list1.add("mohan"); 
	list1.add("naidu");
	list1.add("medarametla");

	ArrayList<String> list2=new ArrayList<String>();
	list2.add("Dilli"); 
	list2.add("naidu");
	list2.add("medarametla");

	
	
	// 1. using retainAll method
	ArrayList<String> list3=new ArrayList<String>(list1);
	list3.retainAll(list2);
	System.out.println("list 1:"+list1);
	System.out.println("list 2:"+list2);
	System.out.println("list 3:"+list3);
	

	//2. usingstreams
	System.out.println(list1.stream().filter(list2::contains).collect(Collectors.toList()));
	//3. iteration 
	ArrayList<String> list4=new ArrayList<String>();
	for(String listobject:list1) {
		if(list2.contains(listobject)) {
			list4.add(listobject);
		}
	}
	System.out.println("list 4"+list4);
	}
}
