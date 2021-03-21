import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student2 {
	
	int rollno;
	String name;
	int age;
	
	public Student2(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	public int getRollno() {
		return rollno;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}

}

public class ComparatorDemo {

	public static void main(String[] args) {
		
		ArrayList<Student2> arrayList= new ArrayList<Student2>();
		
		arrayList.add(new Student2(23, "Lebron", 37));
		arrayList.add(new Student2(3, "AD", 29));
		arrayList.add(new Student2(0, "KUZ", 25));
		
		Comparator<Student2> cm1 = Comparator.comparing(Student2 :: getName);
		
		Collections.sort(arrayList, cm1);
		
		System.out.println("Sorting by name");
		
		for(Student2 st : arrayList) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		
		Comparator<Student2> cm2 = Comparator.comparing(Student2 :: getAge);
		
		Collections.sort(arrayList, cm2);
		
		System.out.println("Sorting by age");

		for(Student2 st : arrayList) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
		

	}

}
