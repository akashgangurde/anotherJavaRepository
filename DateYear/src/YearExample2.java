import java.time.LocalDate;
import java.time.Year;

public class YearExample2 {

	public static void main(String[] args) {
		Year y = Year.of(2018);
	    LocalDate l = y.atDay(123); 
	    System.out.println(l);
	}

}
