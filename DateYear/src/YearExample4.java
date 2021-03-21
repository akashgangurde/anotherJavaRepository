import java.time.Year;

public class YearExample4 {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter the year ");
		int n = scanner.nextInt();
		scanner.nextLine();
		Year year = Year.of(n);
		System.out.println(year.isLeap());
		scanner.close();
	}

}
