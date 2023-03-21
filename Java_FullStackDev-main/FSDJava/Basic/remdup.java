package Basic;

import java.util.*;

public class remdup {
	public static void main(String[] args) {
		List<Integer> rn = new ArrayList<>();
		rn.add(10);
		rn.add(10);
		rn.add(10);
		rn.add(20);
		rn.add(20);
		rn.add(30);
		rn.add(40);
		rn.add(40);
		System.out.println("List with duplicates: ");
		System.out.println(rn);
		
		System.out.println("List without duplicate: ");
		Set<Integer> s = new HashSet<>();
		for(int i:rn) {
			s.add(i);
		}
		System.out.println(s);
	}
}
