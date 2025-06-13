package taskPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListOfListIntoSingleList {
public static void main(String[] args) {
	
	       	// Create a list of lists
	        List<List<String>> listOfLists = new ArrayList<>();

	        // Create individual lists
	        List<String> list1 = new ArrayList<>();
	        list1.add("Apple");
	        list1.add("Banana");

	        List<String> list2 = new ArrayList<>();
	        list2.add("Carrot");
	        list2.add("Tomato");

	        List<String> list3 = new ArrayList<>();
	        list3.add("Fish");
	        list3.add("Chicken");

	        // Add individual lists to the list of lists
	        listOfLists.add(list1);
	        listOfLists.add(list2);
	        listOfLists.add(list3);
	        
	        System.out.println(listOfLists);
	        
	        List<String> singleList = listOfLists.stream()    // Stream the list of lists
	                .flatMap(List::stream)                        // Flatten the stream (merge all inner lists)
	                .collect(Collectors.toList());                // Collect into a single list
	        System.out.println(singleList);
	       
	
	}
}
