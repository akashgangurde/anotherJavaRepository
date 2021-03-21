
public class WordCount {

	public static void main(String[] args) {
		String string = "lakers 2020 champs";
		
		System.out.println(countWords(string));

	}
	
	public static int countWords(String string) {
		
		int count=0;
	      
        char ch[]= new char[string.length()];
        
        for(int i=0;i<string.length();i++)
        {
            ch[i]= string.charAt(i);
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )
                count++;
        }
        return count;
	}

}
