class Student {
	int rollNo;
	String name;
	
	static String college = "ITS";

	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
	void display () {
		System.out.println(this.rollNo + " " + this.name + " " + college);
	}
}
public class TestStaticVariable1 {

	public static void main(String[] args) {
		Student s1 = new Student(111,"Karan");
		Student s2 = new Student(222, "Aryan");
		
		s1.display();
		s2.display();

	}

}
