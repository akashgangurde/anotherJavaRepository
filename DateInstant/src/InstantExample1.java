import java.time.Instant;

public class InstantExample1 {

	public static void main(String[] args) {
		
		Instant inst = Instant.parse("2011-11-03T10:37:30.00Z");
	    System.out.println(inst);
	}

}
