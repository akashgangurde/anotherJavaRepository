
public class ifElseNested {

	public static void main(String[] args) {
		int age = 25;
		int weight = 75;
		
		if (age > 18) {
			if (weight > 55) {
				System.out.println("ELIGIBLE TO DONATE BLOOD");
			} else {
				System.out.println("Not eligible Weight must be above 55");
			}
		} else {
			System.out.println("Not eligible Age must be above 18");
		}
	}

}
