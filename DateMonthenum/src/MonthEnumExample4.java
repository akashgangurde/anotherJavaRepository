import java.time.LocalDate;
import java.time.Month;

public class MonthEnumExample4 {

	public static void main(String[] args) {
		Month month = Month.from(LocalDate.now()); 
	    System.out.println(month.plus(2));
	}

}
