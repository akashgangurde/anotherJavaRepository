import java.util.EnumSet;
import java.util.Set;

//enum days {
//	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
//}

public class EnumSetExample2 {

	public static void main(String[] args) {
		
		Set<days> set = EnumSet.allOf(days.class);
		System.out.println("Week Days: " + set);
		
		Set<days> set2 = EnumSet.noneOf(days.class);
		System.out.println("Week Days: " + set2);

	}

}
