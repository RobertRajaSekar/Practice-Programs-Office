package taskPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FindSecondLargest {
public static void main(String[] args) {
	Integer [] a = {23,48,90,345,345,23,67,23,67,55};
//	List<Integer> l= new ArrayList<Integer>(Arrays.asList(a));
	
	
	Map<String, String> m1= new TreeMap<String, String>();
	
	
	
	int firstMax=a[0];
	int secondMax=a[0];
	for(int i=1;i<a.length;i++) {
		if(a[i]>firstMax) {
			secondMax=firstMax;
			firstMax=a[i];
		}
		if(a[i]>secondMax && a[i]!=firstMax) {
			secondMax=a[i];
		}
	}
	System.out.println(secondMax);
	
//	System.out.println(Arrays.stream(a).sorted().max());   
//	
//
//			//23,48,90,345,345
			//23,48,90,345
//	//			
	        int secondMax2 = Arrays.stream(a).distinct()
	                .sorted((x,y)->y-x)
	                .skip(1)  
	                .findFirst()
	                .get();

//	        List<Integer> l =Arrays.stream(a).distinct().sorted().toList();
//	        System.out.println(l);
	        System.out.println("Second Maximum: " + secondMax2);
	    }

}
