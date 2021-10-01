
public class Demo {

	public static void main(String[] args) {
		System.out.println("Hello Guys");
		Demo.print();
		
		Student s = new Student(1, "Apoorv");
		s.print();
		Student s2 = new Student(2, "Himanshu");
		s2.print();
		Student s3 = new Student(3, "Prakhar");
		s3.print();
	}
	
	public static void print() {
		System.out.println("Printing");
	}

}

class Student{
	private int rollNo;
	private String name;
	
	public Student() {
		// TODO Auto-generated constructor stub
		rollNo=123;
		name="Himanshu";
	}
	
	public Student(int rollNo, String name) {
		this.rollNo=rollNo;
		this.name=name;
	}
	
	public void print() {
		System.out.println("Roll no\t"+rollNo);
		System.out.println("Name\t"+name);
	}
}
