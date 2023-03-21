package Lists;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class studname {
	public static void main(String[] args) {
		List<String> rn = new ArrayList<>();
		rn.add("ABC");
		rn.add("DEF");
		rn.add("GHI");
		rn.add("JKL");
		
//		for(String i:rn) {
//			System.out.println(i);
//		}
		
		rn.forEach((s)->System.out.println(s));
	}

}
