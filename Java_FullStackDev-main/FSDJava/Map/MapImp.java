package Map;

import java.util.*;

public class MapImp {
	public static void main(String[] args) {
		Map<Integer, String> student = new HashMap<>();
		student.put(1, "ABC");
		student.put(2, "DEF");
		student.put(3, "GHI");
		System.out.println(student);
	}
}
