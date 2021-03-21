class Student{
	int rollNo;
	String name;
	float fee;
	
	Student(int rollNo, String name, float fee) {
		rollNo = rollNo;
		name = name;
		fee = fee;
	}
	
	void display() {
		System.out.println(rollNo + " " + name + " " + fee);
	}
}
public class WithoutThis {

	public static void main(String[] args) {
		Student s1=new Student(111, " ankit", 5000f);  
		Student s2=new Student(112, "sumit", 6000f);  
		s1.display();  
		s2.display();

	}

}
