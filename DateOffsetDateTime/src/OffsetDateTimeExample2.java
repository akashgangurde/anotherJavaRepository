import java.time.OffsetDateTime;

public class OffsetDateTimeExample2 {

	public static void main(String[] args) {
		OffsetDateTime dateTime = OffsetDateTime.now();
		System.out.println(dateTime.getDayOfYear());
	}

}
