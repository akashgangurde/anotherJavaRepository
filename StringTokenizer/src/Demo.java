import java.util.StringTokenizer;

public class Demo {

	public static void main(String[] args) {
		
		StringTokenizer stringTokenizer = new StringTokenizer("Lakers 2020 champions");
		while (stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken(" "));
			
		}

	}

}
