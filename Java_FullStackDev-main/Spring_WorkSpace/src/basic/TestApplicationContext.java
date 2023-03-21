package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplicationContext {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		Student s = (Student) ac.getBean("s");
		s.display();
		
		System.out.println(s);
		Student s1 = (Student) ac.getBean("s");
		System.out.println(s1);
	}

}
