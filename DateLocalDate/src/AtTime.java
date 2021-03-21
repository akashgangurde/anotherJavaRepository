import java.time.LocalDate;
import java.time.LocalDateTime;

public class AtTime {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2017, 1, 15);
		LocalDateTime dateTime = date.atTime(1, 50, 25);
		
		System.out.println(dateTime);

	}

}
