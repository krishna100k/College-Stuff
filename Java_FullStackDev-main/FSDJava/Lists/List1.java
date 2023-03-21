package Lists;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class List1 {
	public static void main(String[] args) {
		List<Integer> rn = new ArrayList<>();
		rn.add(10);
		rn.add(20);
		rn.add(30);
		rn.add(40);
		rn.add(40); //adding duplicate elements 
		rn.add(null); //adding null elements
		//System.out.println(rn);
		//rn.remove(2);
		//System.out.println(rn);
		//System.out.println(rn.get(1));
		
		
		System.out.println("Display elements one by one: ");
//		for(int i:rn) {
//			System.out.println(i);
//		}
		
//		rn.forEach((s)->System.out.println(s));
		
		rn.forEach(System.out::println);
	}
}
