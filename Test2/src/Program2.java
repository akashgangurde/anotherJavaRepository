class Student {
	
	private int roll_no;
	private String name;
	private int age;
	
	public Student(int roll_no, String name, int age) {
		this.roll_no = roll_no;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
public class Program2 {

	public static void main(String[] args) {
		
		Student student = new Student(23, "Lebron", 26);
		
		System.out.println(student.toString());
	}

}
