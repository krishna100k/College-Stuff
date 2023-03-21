package Sets;

import java.util.*;


public class SetImp {
	
	public static void main(String[] args) {
		Set<Integer> s = new HashSet<>();
		s.add(10);
		s.add(10);
		s.add(20);
		s.add(30);
		
		System.out.println(s);
		System.out.println(s.contains(100));
		s.forEach(System.out::println);
	}
}
