import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample1 {
	
	public enum Days {
		Monday, Tuesday, Wednesday, Thursday
	};

	public static void main(String[] args) {
		
		EnumMap<Days, String> enumMap = new EnumMap<Days, String>(Days.class);
		
		enumMap.put(Days.Monday, "1");
		enumMap.put(Days.Tuesday, "2");
		enumMap.put(Days.Wednesday, "3");
		enumMap.put(Days.Thursday, "4");
		
		for(Map.Entry entry : enumMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
