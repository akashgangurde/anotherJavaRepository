
public class RemoveChar {

	public static void main(String[] args) {
		
		String str = "Lakers 2020 Champs";
		
        System.out.println(charRemoveAt(str, 10));
     }
	
     public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
     }

}
