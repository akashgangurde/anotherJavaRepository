import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class InputStreamExample3 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fin = new FileInputStream("E:\\a.txt");
		FileInputStream fin2 = new FileInputStream("E:\\b.txt");
		FileInputStream fin3 = new FileInputStream("E:\\c.txt");
		FileInputStream fin4 = new FileInputStream("E:\\d.txt");
		
		Vector v = new Vector<>();
		v.add(fin);
		v.add(fin2);
		v.add(fin3);
		v.add(fin4);
		
		Enumeration e = v.elements();
		
		SequenceInputStream bin = new SequenceInputStream(e);
		
		int i = 0;
		while((i = bin.read()) != -1) {
			System.out.print((char)i);
		}
		
		bin.close();
		fin.close();
		fin2.close();
	}

}
