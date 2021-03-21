	
public class HashcodeTest {

	public static void main(String[] args) {
		System.out.println("Hashode test of a String:");
		String string = "java";
		System.out.println(string.hashCode());
		string += "tpoint";
		System.err.println(string.hashCode());
		
		System.out.println("Hashode test of a StringBuffer:");
		StringBuffer stringBuffer = new StringBuffer("Java");
		System.out.println(stringBuffer.hashCode());
		stringBuffer.append("tpoint");
		System.out.println(stringBuffer.hashCode());
		
	}

}
