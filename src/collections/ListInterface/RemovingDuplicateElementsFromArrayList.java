package collections.ListInterface;

import java.util.ArrayList;
import java.util.HashSet;

public class RemovingDuplicateElementsFromArrayList {
	public static void main(String[] args)
    {
 
        ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
        listWithDuplicateElements.add("JAVA");
        listWithDuplicateElements.add("J2EE");
        listWithDuplicateElements.add("JSP");
        listWithDuplicateElements.add("SERVLETS");
        listWithDuplicateElements.add("JAVA");
        listWithDuplicateElements.add("STRUTS");
        listWithDuplicateElements.add("JSP");
 
        System.out.println("ArrayList With Duplicate Elements :"+listWithDuplicateElements);
        HashSet<String> set = new HashSet<String>(listWithDuplicateElements);
       // LinkedHashSet<String> set1 = new LinkedHashSet<String>(listWithDuplicateElements);

        ArrayList<String> listWithoutDuplicateElements = new ArrayList<String>(set);
        System.out.println("ArrayList After Removing Duplicate Elements :"+listWithoutDuplicateElements);
    }
}
