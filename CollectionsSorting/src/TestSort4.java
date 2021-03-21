import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements Comparable<Student> {
	public String name;

	public Student(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student person) {
		return name.compareTo(person.name);
	}
}

public class TestSort4 {

	public static void main(String[] args) {
		
		ArrayList<Student> arrayList = new ArrayList<Student>();
		
		arrayList.add(new Student("Lebron"));
		arrayList.add(new Student("AD"));
		arrayList.add(new Student("Kuz"));
		arrayList.add(new Student("KCP"));

		Collections.sort(arrayList);
		
		for(Student student : arrayList) {
			System.out.println(student.name);
		}
	}

}
