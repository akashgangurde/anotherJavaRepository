import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumSetExample1 {

	public static void main(String[] args) {
		
		Set<days> set = EnumSet.of(days.TUESDAY, days.WEDNESDAY);
		
		Iterator<days> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
