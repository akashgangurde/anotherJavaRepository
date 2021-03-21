import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeMinus {

	public static void main(String[] args) {
			
		LocalDateTime datetime1 = LocalDateTime.of(2019, 11, 24, 10, 34);
		LocalDateTime datetime2 = datetime1.minusDays(100);
		
		System.out.println("Before Formatting: " + datetime2);
			  
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
			  
		String formatDateTime = datetime2.format(format);
		System.out.println("After Formatting: " + formatDateTime );
			
	}

}
