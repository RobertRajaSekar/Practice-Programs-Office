package taskPrograms;

import java.util.Arrays;

public class SortAndPrintDublicatesof2Arrays {
public static void main(String[] args) {
	int[] a = {1,5,10,3,7};
	int [] b = {10,2,7,8,4,5};
	
	int[] c = new int[a.length+b.length];
	
	int j=0;
	for(int i=0;i<c.length;i++) {
		if(i<a.length) {
			c[i]=a[i];	
		}
		else {
			c[i] =b[j];
			j++;
		}
	}
	
//	boolean duplicate = false;
	for(int i=0;i<c.length;i++) {
		for(int k=0;k<c.length-1;k++) {
			if(c[k]>c[k+1]) {
				int temp = c[k];
				c[k]=c[k+1];
				c[k+1]=temp;
			}
		}
//		if (i > 0 && c[i] == c[i - 1]) {
//            if (!duplicate) {
//                System.out.println(c[i]); 
////                duplicate = true; 
//            }
//        } else {
//            duplicate = false;
//        }
    }
	System.out.println(Arrays.toString(c));
	
	for(int i=0;i<c.length;i++) {
		int count=1;
		for(int k=i+1;k<c.length;k++) {
			if(c[i]==c[k]) {
				count++;
				c[k]=Integer.MAX_VALUE;
			}	
		}
		if(count>1 && c[i]!=Integer.MAX_VALUE) {
			System.out.println("Dublicate elements are "+c[i]);
		}	
}
}
}
