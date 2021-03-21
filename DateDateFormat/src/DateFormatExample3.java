import java.sql.Date;
import java.text.DateFormat;

public class DateFormatExample3 {

	public static void main(String[] args) throws Exception {
		
		Date d = (Date) DateFormat.getDateInstance().parse("15 Mar, 2010");
        System.out.println("Date is: "+d);

	}

}
