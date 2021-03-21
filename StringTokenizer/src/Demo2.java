import java.util.StringTokenizer;

public class Demo2 {

	public static void main(String[] args) {
		
		StringTokenizer stringTokenizer = new StringTokenizer("Lakers,2020,champions");
		
		System.out.println("Next token is: " + stringTokenizer.nextToken(","));
	}

}
