import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class DayOfWeekExample3 {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.of(2011, Month.JANUARY, 11);
	    DayOfWeek day = DayOfWeek.from(date);
	    
	    System.out.println(day.getValue());
	    day = day.plus(3);
	    System.out.println(day.getValue());
	}

}
