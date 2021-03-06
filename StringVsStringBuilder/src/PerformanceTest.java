
public class PerformanceTest {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		concatWithString();
		System.out.println("Time taken by Concating with String: " + (System.currentTimeMillis() - startTime) + "ms");
        startTime = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Time taken by Concating with  StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");

	}
	
	public static String concatWithString() {
		String t = "Java";
		
		for (int i = 0; i < 1000; i++) {
			t += "Tpoint";
		}
		
		return t;
	}
	
	public static String concatWithStringBuffer() {
		StringBuffer t = new StringBuffer("Java");
		
		for (int i = 0; i < 1000; i++) {
			t.append("Tpoint");
		}
		
		return t.toString();
	}

}
