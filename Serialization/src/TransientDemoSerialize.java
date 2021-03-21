import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student2 implements Serializable {
	int id;
	String name;
	transient int age;
	
	public Student2(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	
	
}
public class TransientDemoSerialize {

	public static void main(String[] args) throws Exception {
		Student2 s1 = new Student2(23, "Lebron James", 36);
		
		FileOutputStream fout = new FileOutputStream("f.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(s1);
		out.flush();
		out.close();
		fout.close();
		System.out.println("success");
		
		
	}
	
	
}
