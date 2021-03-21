import java.util.Scanner;

public class ScannerClassExample2 {

	public static void main(String args[]){  
		
		String str = "Hello/This is Scanner/My name is AD.";  

		Scanner scanner = new Scanner(str);
        System.out.println("Boolean Result: " + scanner.hasNextBoolean());
        
        scanner.useDelimiter("/");
        
        System.out.println("--------Tokenizes String-------");
      while(scanner.hasNext()){
          System.out.println(scanner.next());
      }
       
        System.out.println("Delimiter used: " + scanner.delimiter()); 
        scanner.close();
        }

}
