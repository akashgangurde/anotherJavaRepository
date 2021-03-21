import java.io.FileOutputStream;

public class FileOutputStreamExample2 {

	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("E:\\testout.txt");
			String s = "Lakers";
			byte b[] = s.getBytes();
			fileOutputStream.write(b);
			fileOutputStream.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
