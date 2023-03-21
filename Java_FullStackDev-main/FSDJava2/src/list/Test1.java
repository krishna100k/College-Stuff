package list;
import java.util.*;

public class Test1 {
	public static void main(String[] args) {
		List<Student1> l= new ArrayList<>();
		Student1 s1 = new Student1(1,"Rock");
		Student1 s2 = new Student1(2,"John");
		Student1 s3 = new Student1(3,"Max");
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		
		for(Student1 s:l) {
			System.out.println(s.roll);
			System.out.println(s.name);
		}
		
	}

}
