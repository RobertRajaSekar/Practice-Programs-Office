package taskPrograms;

public class SumOfElementsEqualToTarget {
public static void main(String[] args) {
	int[] a = {6,5,4,3,1};
	
	
	int target = 4;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			int sum=0;
			for(int k=i;k<=j;k++) {
				sum+=a[k];
			}
				 if (sum == target) {
	                 System.out.print("Subarray with sum " + target + " : ");
	                 for (int k = i; k <= j; k++) {
	                     System.out.print(a[k] + " ");
	                 }
	                 System.out.println();
				 }
		}
	}
}
}
