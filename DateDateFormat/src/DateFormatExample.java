import java.sql.Date;
import java.text.DateFormat;

public class DateFormatExample {

	public static void main(String[] args) {
		
        Date currentDate = new Date(0);
        
        System.out.println("Current Date: " + currentDate);
        String dateToStr = DateFormat.getInstance().format(currentDate);  
        System.out.println("Date Format using getInstance(): " + dateToStr);  
    }

}
