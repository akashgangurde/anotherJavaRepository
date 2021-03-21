
public class WrapperInSwitchCaseExample {

	public static void main(String[] args) {
		
		Integer age = 18;
		
		switch(age) {
		
		case 16:
			System.out.println("You are under 18");
			break;
			
		case 18:
			System.out.println("Eligible to vote");
			break;
			
		case 65:
			System.out.println("Senior Citizen");
			break;
			
		default:
			System.out.println("Invalid age");
			break;
		}

	}

}
