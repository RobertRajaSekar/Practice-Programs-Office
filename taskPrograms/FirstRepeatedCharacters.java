package taskPrograms;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FirstRepeatedCharacters {
	public static void main(String[] args) {
	
		String s ="robert raja sekar";
		boolean flag=false;
		Set<Character> seen = new HashSet<>();
		
		char[] c = s.toCharArray();
		
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]==c[j]) {
					System.out.println("The First Repeated Character is ---> "+c[i]);
					flag=true;
				}
			}
			if(flag==true) 
			break;
		}
		
		
//	s.chars()
//	        .mapToObj(c -> (char) c)            
//	        .filter(c -> !seen.add(c))         
//	        .forEach(d->System.out.print(d+" "));	
       
//		s.chars()
//        .mapToObj(c -> (char) c)            
//        .filter(c -> !seen.add(c)).findFirst().ifPresentOrElse(
//            c -> System.out.println("First repeated character is : " + c),
//            () -> System.out.println("No repeated characters found.")
//        );
		
	}
}
