package taskPrograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxSumOfSubArray {
public static void main(String[] args) {
	int [] a = {2,3,-8,7,-1,2,3};
	
	List<Integer> list = new ArrayList<Integer>();
	
	int maxsum=0;
	for(int i=0;i<a.length;i++) {
			
		for(int j=i;j<a.length;j++) {
			int sum=0;
			for(int k=i;k<=j;k++) {
				sum+=a[k];
				if(maxsum<sum) {
					maxsum=sum;
				}
			}
			list.add(sum);
		}
		
	}
	System.out.println(maxsum);
	
	 System.out.println(list);
	 Optional<Integer> op =list.stream().max(Integer::compareTo);
	 op.ifPresent(max->System.out.println(max));
}
}
