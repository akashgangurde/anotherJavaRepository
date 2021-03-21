class Student {
	private int rollNo;
	private String name;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Roll No " + this.rollNo);
		System.out.println("Name " + this.name);
	}
	
	
}
public class AccesorAndMutatorMethod {

	public static void main(String[] args) {
		Student student = new Student();
		student.display();

	}

}
