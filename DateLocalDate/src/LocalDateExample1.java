import java.time.LocalDate;

public class LocalDateExample1 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		LocalDate yesterday = date.minusDays(1);
		LocalDate tomorrow = date.plusDays(2);
		System.out.println("Todays Date: " + date);
		System.out.println("Yesterdays Date: " + yesterday);
		System.out.println("Tomorrows Date: " + tomorrow);

	}

}
