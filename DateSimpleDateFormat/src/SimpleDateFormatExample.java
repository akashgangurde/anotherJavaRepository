import java.sql.Date;
import java.text.SimpleDateFormat;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		
		Date date = new Date(2011, 11, 18);  
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	    String strDate= formatter.format(date);  
	    System.out.println(strDate);
	}

}
