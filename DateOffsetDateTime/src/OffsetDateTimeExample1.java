import java.time.OffsetDateTime;

public class OffsetDateTimeExample1 {

	public static void main(String[] args) {
		OffsetDateTime dateTime = OffsetDateTime.now();
		System.out.println(dateTime.getDayOfMonth());
	}

}
