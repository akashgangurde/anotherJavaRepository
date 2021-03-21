import java.time.LocalTime;

public class Minus {

	public static void main(String[] args) {
		LocalTime time = LocalTime.of(1, 25, 15, 14);
		System.out.println(time);
		
		LocalTime time2 = time.minusHours(2);
		LocalTime time3 = time.minusMinutes(25);
		
		System.out.println(time3);

	}

}
