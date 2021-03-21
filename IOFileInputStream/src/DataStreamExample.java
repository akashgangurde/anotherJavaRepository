import java.io.FileInputStream;

public class DataStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("E:\\testout.txt");
			int i = fileInputStream.read();
			System.out.print((char)i);
			
			fileInputStream.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
