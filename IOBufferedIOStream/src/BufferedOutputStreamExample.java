import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
public class BufferedOutputStreamExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout = new FileOutputStream("E:\\testout.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String string = "Lakers";
		byte b[] = string.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("success");

	}

}
