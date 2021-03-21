import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.Temporal;

public class ZoneOffsetExample1 {

	public static void main(String[] args) {
		
		ZoneOffset zone = ZoneOffset.UTC;  
	    Temporal temp = zone.adjustInto(ZonedDateTime.now());  
	    System.out.println(temp);
	}

}
