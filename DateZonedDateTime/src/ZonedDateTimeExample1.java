import java.time.ZonedDateTime;

public class ZonedDateTimeExample1 {

	public static void main(String[] args) {
		ZonedDateTime zone = ZonedDateTime.parse("2011-11-05T08:20:10+05:30[Asia/Kolkata]");
	    System.out.println(zone);
	}

}
