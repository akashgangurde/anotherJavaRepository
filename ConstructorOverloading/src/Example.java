class Student {
	int id;
	String name;
	int age;
	
	Student(int i, String n) {
		id = i;
		name = n;
	}
	
	Student(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}
	
	void dislpay() {
		System.out.println(id + " " + name + " " + age);
	}
	
}
public class Example {

	public static void main(String[] args) {
		Student s1 = new Student(01,  "Karan");
		Student s2 = new Student(02,  "AG", 25);
		
		s1.dislpay();
		s2.dislpay();

	}

}
