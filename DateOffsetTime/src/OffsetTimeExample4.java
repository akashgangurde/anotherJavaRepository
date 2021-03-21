import java.time.OffsetTime;

public class OffsetTimeExample4 {

	public static void main(String[] args) {
		OffsetTime time = OffsetTime.now();
		int s = time.getSecond();
		System.out.println(s + " sec");
	}

}
