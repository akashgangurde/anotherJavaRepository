import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("E:\\testout.txt");
			fileOutputStream.write(65);
			fileOutputStream.close();
			System.out.println("success...");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
