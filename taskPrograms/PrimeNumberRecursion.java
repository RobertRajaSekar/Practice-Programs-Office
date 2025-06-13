package taskPrograms;

import java.util.Scanner;

public class PrimeNumberRecursion {

	
	public static void printPrime(int num,int range) {
		int count=0;
        if (num <= range) {
        	for(int i=1;i<=num;i++) {
    			if(num%i==0) {
    				count++;
    			}
    		}
		        	if(count==2) {
		        		System.out.print(num+" ");
		        	}
        		 
        		 printPrime(num+1, range);         
        }
	}
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Range that you Want to print the Prime Numbers");
	int range = sc.nextInt();
	printPrime(1,range);
}
}
