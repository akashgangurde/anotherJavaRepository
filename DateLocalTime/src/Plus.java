import java.time.LocalTime;

public class Plus {

	public static void main(String[] args) {
		LocalTime time = LocalTime.of(1, 25, 15, 14);
		System.out.println(time);
		
		LocalTime time2 = time.plusHours(2);
		LocalTime time3 = time.plusMinutes(25);
		
		System.out.println(time3);
	}

}
