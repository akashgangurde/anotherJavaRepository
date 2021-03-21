import java.time.OffsetDateTime;

public class OffsetDateTimeExample3 {

	public static void main(String[] args) {
		OffsetDateTime dateTime = OffsetDateTime.now();
		System.out.println(dateTime.getDayOfWeek());
	}

}
