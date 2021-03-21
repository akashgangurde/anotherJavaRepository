class Student4 {
	int id;
	String name;
	
	Student4(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	
	void displayInformation() {
		System.out.println(id + " " + name);
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		Student4 s1 = new Student4(111,"Karan");  
		Student4 s2 = new Student4(222,"Aryan");  
		   
		s1.displayInformation();  
		s2.displayInformation();  

	}

}
