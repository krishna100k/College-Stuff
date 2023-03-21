package basic;

public class Student {
	//primitive dependencies
	private int rollno;
	private String name;
	
	public Student() {
		System.out.println("This is student class constructor");
	}
	
	public void display() {
		System.out.println("Display method call");
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
