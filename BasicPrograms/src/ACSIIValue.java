
public class ACSIIValue {

	public static void main(String[] args) {
		
		//Asigning int value to char/

		char ch1 = 'a';
		int asciivalue1 = ch1;
		
		System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue1);
		
		//Using TypeCasting
		
		char ch2 = 'b';
		int ascii2 = (int) ch2;
		
		System.out.println("The ASCII value of " + ch1 + " is: " + ascii2);
		
		//for loop
		
		for(int i = 65; i <= 67; i++)  { 
			System.out.println("The ASCII value of " + (char)i + "  =  " + i);  
		}  

	}

}
