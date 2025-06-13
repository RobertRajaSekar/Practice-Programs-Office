package taskPrograms;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class FibonacciSeries {
public static void main(String[] args) {
	//1st method
	 // Create a scanner to take input from user
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the number of terms for Fibonacci series: ");
    int terms = scanner.nextInt();
    
    // Use Stream to generate Fibonacci sequence
    Stream.iterate(new int[]{0, 1}, fib -> new int[]{fib[1], fib[0] + fib[1]})
          .limit(terms)
          .map(fib -> fib[0])
          .forEach(num -> System.out.print(num + " "));
    
    scanner.close();
    
    
    int[] a= {11,22,33};
    int[] b= {44,55,66};
    
    int[] c = new int[a.length+b.length];
    int j=0;
    for(int i=0;i<c.length;i++) {
    	if(i<a.length) {
    		c[i]=a[i];
    	}
    	else {
    		c[i]=b[j];
    		j++;
    	}
    }
    System.out.println(Arrays.toString(c));
    
    
    
    
   //2nd Method
    
//    Stream<int[]> stream = Stream.iterate(
//            new int[]{0, 1},                    // Seed value: first two Fibonacci numbers
//            fib -> fib[0] < 10,                 // Predicate: Stop when the first value reaches 10
//            fib -> new int[]{fib[1], fib[0] + fib[1]} // Unary operator: generate next pair
//        );    
//    stream.forEach(fib->System.out.print(fib[0]+" "));
}
}
