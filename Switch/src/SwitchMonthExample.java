
public class SwitchMonthExample {

	public static void main(String[] args) {
		int month = 5;
		String monthString = "";
		
		switch(month) {
		case 1 : monthString = "1 - January";
		break;
		
		case 2 : monthString = "2 - Feb";
		break;
		
		case 3 : monthString = "3 - Mar";
		break;
		
		case 4 : monthString = "4 - Apr";
		break;
		
		case 5 : monthString = "5 - May";
		break;
		
		case 6 : monthString = "6 - Jun";
		break;
		
		case 7 : monthString = "7 - Jul";
		break;
		
		case 8 : monthString = "8 - Aug";
		break;
		
		case 9 : monthString = "9 - Sept";
		break;
		
		case 10 : monthString = "10 - Oct";
		break;
		
		case 11 : monthString = "11 - Nov";
		break;
		
		case 12 : monthString = "12 - Dec";
		break;
		
		default:
			System.out.println("Invalid month");
		}
		
		System.out.println(monthString);

	}

}
