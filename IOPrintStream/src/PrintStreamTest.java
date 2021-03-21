import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamTest {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fout = new FileOutputStream("E:\\testout.txt ");
		PrintStream pout = new PrintStream(fout);
		pout.println(2016);
		pout.println("Hello LA");
		pout.println("Welcome to LA");
		pout.close();
		fout.close();
		
		System.out.println("Success?");
	}

}
