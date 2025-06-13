package taskPrograms;

public class DiamondPattern {
public static void main(String[] args) {
	int n=4;
	System.out.println("--------Diamond-----------");
	for(int i=1;i<=n*2-1;i++) {
		for(int j=1;j<=n*2-1;j++) {			
			if(i+j>=n+1 && j-i<=n-1 && i+j<=n*3-1 && i-j<=n-1) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
	System.out.println("------------------------------------");
	
	for(int i=1;i<=n*2-1;i++) {
		for(int j=1;j<=n*2-1;j++) {			
			if(i+j>=n+1 &&(i+j)%2==0 && j-i<=n-1 && i-j<=n-1 && j+i<=n*3-1) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	
}
}
