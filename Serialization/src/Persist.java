import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.io.Serializable;

class Student implements Serializable {
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
public class Persist {

	public static void main(String[] args) {
		try {
			Student s1 = new Student(23, "Lebron James");
			
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			
			out.writeObject(s1);
			out.flush();
			out.close();
			System.out.println("success");
			
			
		} catch (Exception e) {
			System.out.println(e);		
			}
	}

}
