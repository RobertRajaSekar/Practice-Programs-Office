package taskPrograms;


public class ArrayElementisPresentOrNot {
	public static boolean isPresent(int[] a1,int[] a2) {
		int count=0;
		for(int i=0;i<a2.length;i++) {
			for(int j=0;j<a1.length;j++) {
				if(a2[i]==a1[j]) {
					a2[i]=Integer.MAX_VALUE;
					count++;
				}
			}
		}
		
		if(count == a2.length) 
			return true;
		else
			return false;
	}
	
public static void main(String[] args) {
	int[] a1 = {6,3,4,2,1,3,3,2,5};
	int[] a2 = {3,2,4};
	
	System.out.println(isPresent(a1, a2));
	
	
}
}
