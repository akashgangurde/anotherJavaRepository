class Student3 {
	int id;
	String name;
	
}
public class InitializationThroughReference2 {

	public static void main(String[] args) {
		Student3 s1 = new Student3();
		Student3 s2 = new Student3();
		
		s1.id = 101;  
		s1.name = "AG";  
		s2.id = 102;  
		s2.name = "DG";  
		
		System.out.println(s1.id+" "+s1.name);  
		System.out.println(s2.id+" "+s2.name);

	}

}
