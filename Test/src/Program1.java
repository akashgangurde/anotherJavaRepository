
public class Program1 {

	public static void main(String[] args)
	{
		int number1=3;
		int number2=5;
		int ch=2;
		switch(ch) {
		case 1:
			if(number1>number2)
			System.out.println("number1 is less than number 2");
		break;
		case 2:
			if (number1 < number2) 
			
			System.out.println("number1 is greater than number 2");
		break;
		case 3:
			if(number1 == number2)
			System.out.println("number1 is equal to number 2");
		break;
		case 4:
			if(number1 != number2)
			System.out.println("number1 is not equal to number 2");
		break;
		default:
			System.out.println("Invalid Condition");
			break;
		}
		
	}

}
