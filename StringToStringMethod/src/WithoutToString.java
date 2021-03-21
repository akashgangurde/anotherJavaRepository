class Student {
	int rollNo;
	String name;
	String city;
	
	public Student(int rollNo, String name, String city) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
	}
	
	
}
public class WithoutToString {

	public static void main(String[] args) {
		
		Student s1 = new Student(101,  "AD",  "LA");
		Student s2 = new Student(101,  "Kuz",  "MIA");
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
