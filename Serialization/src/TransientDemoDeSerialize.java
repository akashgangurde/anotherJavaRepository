import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TransientDemoDeSerialize {

	public static void main(String[] args) throws Exception {
		ObjectInputStream in=new ObjectInputStream(new FileInputStream("f.txt"));
		Student2 s=(Student2)in.readObject();
		System.out.println(s.id+" "+s.name+" " + s.age);
		in.close();
	}

}