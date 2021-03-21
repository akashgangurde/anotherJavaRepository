import java.util.Scanner;

public class Armstrong {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number to check if it is an Armstrong Number");
		int number = scanner.nextInt();
		scanner.nextLine();
		
		int c = 0, a, temp;
	    temp = number;
	    while(number > 0) {
	    	a = number % 10;
	    	number = number / 10;
	    	c = c + (a * a * a);
	    }
	    
	    if(temp == c) {
		    System.out.println(number + " is an Armstrong number");
	    }
	    else  {
	        System.out.println(number + " is not an Armstrong number");
	    }
	    
	    scanner.close();
	}
	


}
