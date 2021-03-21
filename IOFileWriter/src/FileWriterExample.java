import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("E:\\testout.txt");
			fw.write("Welcome to LA");
			fw.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("success");
	}

}
