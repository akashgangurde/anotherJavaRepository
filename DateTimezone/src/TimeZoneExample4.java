import java.util.TimeZone;

public class TimeZoneExample4 {
		
	public static void main( String args[] ) {
		
		TimeZone zone = TimeZone.getDefault();  
		String name = zone.getDisplayName();         
		
		System.out.println("Display for default time zone: " + name);  
			
		
	}

}
