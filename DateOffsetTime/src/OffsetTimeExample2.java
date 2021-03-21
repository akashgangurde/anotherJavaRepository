import java.time.OffsetTime;

public class OffsetTimeExample2 {

	public static void main(String[] args) {
		OffsetTime time = OffsetTime.now();
		int h = time.getHour();
		System.out.println(h + " hour");
	}

}
