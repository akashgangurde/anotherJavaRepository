import java.io.FileInputStream;

public class DataStreamExample2 {

	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("E:\\testout.txt");
			int i = 0;
			while(( i = fileInputStream.read()) != -1) {
				System.out.print((char)i);
			}
			
			fileInputStream.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
