import java.util.ArrayList;
import java.util.Iterator;

class Student {
	int rollNo;
	String name;
	int age;
	
	public Student(int rollNo, String name, int age) {
		this.rollNo = rollNo;
		this.name = name;
		this.age = age;
	}
	
	
}
public class ArrayListExample6 {

	public static void main(String[] args) {
		
		Student s1 = new Student(23, "Lebron", 36);
		Student s2 = new Student(3, "AD", 29);
		Student s3 = new Student(5, "Kuz", 25);
		
		ArrayList<Student> arrayList = new ArrayList<Student>();
		
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		
		Iterator itr = arrayList.iterator();
		
		while(itr.hasNext()) {
			Student st = (Student)itr.next();
			System.out.println(st.rollNo + " " + st.name + " " + st.age);
		}
		
	}

}
