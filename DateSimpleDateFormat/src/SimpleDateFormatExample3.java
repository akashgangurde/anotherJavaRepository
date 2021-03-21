import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class SimpleDateFormatExample3 {

	public static void main(String[] args) {
		
	    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	    
	    try {
	        java.util.Date date = formatter.parse("31/03/2015");
	        System.out.println("Date is: "+date);
	    } catch (ParseException e) {
	    	e.printStackTrace();
	    
	    }
	}

}
