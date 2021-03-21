import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student2> {
	
	int rollno;
	public String name;
	int age;
	
	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Student2 st) {
		if (age == st.age) {
			return 0;
		} else if (age > st.age) {
			return 1;
		} else {
			return -1;
		}
	}
	
}

public class ComparableDemo {

	public static void main(String[] args) {
		
		ArrayList<Student2> arrayList = new ArrayList<Student2>();
		
		arrayList.add(new Student2(23, "Lebron", 37));
		arrayList.add(new Student2(3, "AD", 29));
		arrayList.add(new Student2(0, "Kuz", 25));
		
		Collections.sort(arrayList);
		
		for(Student2 st : arrayList) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}

}
