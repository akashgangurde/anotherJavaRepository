
public class NestedSwitchExample {

	public static void main(String[] args) {
		
		char branch = 'C';
		int collegeYear = 4;
		
		switch(collegeYear) {
		case 1:
			System.out.println("eng, maths, science");
			break;
			
		case 2:
			switch(branch) {
			case 'C':
                System.out.println("Operating System, Java, Data Structure");
                break;
                
			case 'E':
                System.out.println("Microprocessors, Logic theory");
                break;
                
			case 'M':
                System.out.println("Drawing, Manufacturing machines");
                break;
			}
			break;
			
		case 3:
			switch(branch) {
			case 'C':
                System.out.println("CO, MM");
                break;
                
			case 'E':
                System.out.println("Fundamentals of logi design, microelectronics");
                break;
                
			case 'M':
                System.out.println("ICE , Mechanical varibles");
                break;
			}
			break;
			
		case 4:
			switch(branch) {
			case 'C':
                System.out.println("Data communication networks, multimedia");
                break;
                
			case 'E':
                System.out.println("Embeded system, image processing	");
                break;
                
			case 'M':
                System.out.println("Production technology, thermal enggineering");
                break;
			}
			break;	
		}

	}

}
