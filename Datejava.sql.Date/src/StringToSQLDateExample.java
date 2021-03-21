import java.sql.Date;

public class StringToSQLDateExample {

	public static void main(String[] args) {
		
		String str="2011-05-18";
	    Date date=Date.valueOf(str);
	    System.out.println(date);
	}

}
