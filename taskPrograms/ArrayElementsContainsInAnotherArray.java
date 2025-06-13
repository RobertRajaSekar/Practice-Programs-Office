package taskPrograms;

import java.util.Arrays;
import java.util.List;

public class ArrayElementsContainsInAnotherArray {
public static void main(String[] args) {
	
	        // Arrays
	        Integer[] a1 = {4, 3, 6, 7, 8, 9, 6};
	        Integer[] a2 = {7, 6, 3, 4};

	        // Convert arrays to lists
	        List<Integer> list1 = Arrays.asList(a1);
	        List<Integer> list2 = Arrays.asList(a2);
	        
	       
//	        System.out.println(list1);
	        // Check if all elements of a2 are present in a1
	        boolean result = list1.containsAll(list2);

	        // Output the result
	        System.out.println("Are all elements of array a2 present in array a1? " + result);

}
}
