
public class ReverseEachWord {

	public static void main(String[] args) {
		System.out.println(reverseWord("lakers champions 2002"));

	}
	
	public static String reverseWord(String str){
		
	    String words[] = str.split("\\s");
	    String reverseWord = "";
	    for(String w : words) {
	    	
	        StringBuilder sb=new StringBuilder(w);
	        sb.reverse();
	        reverseWord+=sb.toString()+" ";
	    }
	    
	    return reverseWord.trim();
	}

}
