import java.io.CharArrayWriter;
import java.io.FileWriter;

public class CharArrayWriterExample {

	public static void main(String[] args) throws Exception {
		
		CharArrayWriter out = new CharArrayWriter();
		out.write("LakeShow");
		FileWriter f1=new FileWriter("E:\\a.txt");
        FileWriter f2=new FileWriter("E:\\b.txt");
        FileWriter f3=new FileWriter("E:\\c.txt");
        FileWriter f4=new FileWriter("E:\\d.txt");
        
        out.writeTo(f1);
        out.writeTo(f2);
        out.writeTo(f3);
        out.writeTo(f4);
        
        f1.close();
        f2.close();
        f3.close();
        f4.close();
        
        System.out.println("Success...");
	}

}
