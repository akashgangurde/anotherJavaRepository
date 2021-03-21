class Student3{
	int rollNo;
	String name;
	float fee;
	
	Student3(int r, String n, float f) {
		rollNo = r;
		name = n;
		fee = f;
	}
	
	void display() {
		System.out.println(rollNo + " " + name + " " + fee);
	}
}
public class ThisNotRequired {

	public static void main(String[] args) {
		Student3 s1=new Student3(111, " ankit", 5000f);  
		Student3 s2=new Student3(112, "sumit", 6000f);  
		s1.display();  
		s2.display();

	}

}
