package taskPrograms;

import java.util.Arrays;

public class MoveNegativeAndPositiveElementstoLeftandRight {
public static void main(String[] args) {
	int[] a = {-3,20,-1,8,-5,3,-7,-3};
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length-1;j++) {
			
			if(a[j]>0 && a[j+1]<0) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
	}
	System.out.println(Arrays.toString(a));
}
}
