class Student1 {
	int id;
	String name;
	
}
public class InitializationThroughReference {

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.id = 101;
		s1.name = "AG";
		System.out.println(s1.id + " " + s1.name);

	}

}
