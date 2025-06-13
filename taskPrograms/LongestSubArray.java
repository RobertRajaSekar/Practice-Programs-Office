package taskPrograms;

public class LongestSubArray {
public static void main(String[] args) {
	String s="bcdaeabed";
	char [] c= s.toCharArray();
	
	for(int i=0;i<c.length;i++) {
		for(int j=i+1;j<c.length;j++) {
			for(int k=i;k<=j-1;k++) {
				if((int)c[k]<(int)c[k+1] && (int)c[k+1]==(int)c[k]+1) {
					System.out.print(c[k]+" ");	
				}
			}
			System.out.println();
		}
	}
 }
}
