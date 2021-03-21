import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterExample {

	public static void main(String[] args) throws Exception {
		
		FileWriter writer = new FileWriter("E:\\testout.txt");
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		bufferedWriter.write("Welcome to LA");
		bufferedWriter.close();
		System.out.println("success");
	}

}
