class Student5 {
	int rollNo;
	String name, course;
	float fee;
	
	Student5(int rollNo, String name, String course) {
		this.rollNo = rollNo;
		this.name = name;
		this.course = course;
	}

	public Student5(int rollNo, String name, String course, float fee) {
		this(rollNo, name, course);
		this.fee = fee;
	}
	
	void display() {
		System.out.println(rollNo+" "+name+" "+course+" "+fee);
	}
	
	
	
}
public class ReuseConstructorFromConstructor {

	public static void main(String[] args) {
		Student5 s1=new Student5(111,"ankit","java");  
		Student5 s2=new Student5(112,"sumit","java",6000f);  
		s1.display();  
		s2.display();  

	}

}
