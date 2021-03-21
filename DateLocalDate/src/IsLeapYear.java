import java.time.LocalDate;

public class IsLeapYear {

	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.of(2017, 1, 15);
		System.out.println(date1.isLeapYear());
		
		LocalDate date2 = LocalDate.of(2012, 12, 15);
		System.out.println(date2.isLeapYear());
	}

}
