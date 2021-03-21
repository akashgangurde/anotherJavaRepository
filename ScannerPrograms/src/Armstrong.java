import java.util.Scanner;

public class Armstrong {
	
	private static Scanner scanner4 = new Scanner(System.in);

	public static void main(String[] args) {		
		
		isArmstrong();
		
	}
	
	private static void isArmstrong() {
		
		System.out.println("Enter a number to check if it is an Armstrong Number");
		int number = scanner4.nextInt();
		scanner4.nextLine();
		
		int c = 0, a, temp;
	    temp = number;
	    while(number > 0) {
	    	a = number % 10;
	    	number = number / 10;
	    	c = c + (a * a * a);
	    }
	    
	    if(temp == c) {
		   System.out.println("is Armstrong");;
	    }
	    else  {
	        System.out.println("is not Armstrong");;
	    } 
	    
	    scanner4.close();
	}
	

}
