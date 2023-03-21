package basic;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	public static void main(String[] args) {
		//step 1: load beans.xml
		Resource r = new ClassPathResource("beans.xml");
		
		//step 2: create object of BeanFactory
		BeanFactory bf = new XmlBeanFactory(r);
		Student s = (Student) bf.getBean("s");
		s.display();
		System.out.println(s.getName());
		System.out.println(s.getRollno());

	}

}
