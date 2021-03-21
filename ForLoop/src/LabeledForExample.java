
public class LabeledForExample {

	public static void main(String[] args) {
		aa:
			for(int i = 1; i <= 10; i++) {
				bb:
					for(int j = 1; j <= 10; j++) {
						if(i == 5 && j ==5) {
							break aa;
						} System.out.println(i + " " + j);
					} 
			}

	}

}
