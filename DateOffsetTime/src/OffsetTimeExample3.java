import java.time.OffsetTime;

public class OffsetTimeExample3 {

	public static void main(String[] args) {
		OffsetTime time = OffsetTime.now();
		int m = time.getMinute();
		System.out.println(m + " min");
	}

}
