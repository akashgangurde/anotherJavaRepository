import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample2 {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
				
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formatDateTime = now.format(formatter);
		System.out.println(formatDateTime);
	}

}
