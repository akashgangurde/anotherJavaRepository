import java.io.CharArrayReader;

public class CharArrayExample {

	public static void main(String[] args) throws Exception {
		
		char[] ary = {'l', 'a', 'k', 'e', 'r', 's'};
		
		CharArrayReader reader = new CharArrayReader(ary);
		int k = 0;
		while ((k = reader.read()) != -1) {
		char ch = (char) k;
		System.out.print(ch + " : ");
		System.out.println(k);
		}
	}

}
