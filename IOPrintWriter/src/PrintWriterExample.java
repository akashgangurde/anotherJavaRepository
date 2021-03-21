import java.io.File;
import java.io.PrintWriter;

public class PrintWriterExample {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

    	PrintWriter writer = new PrintWriter(System.out);    
    	writer.write("LAL 2020.");        
    	writer.flush();  
    	writer.close();  
    	
    	PrintWriter writer1 =null;      
        
    	writer1 = new PrintWriter(new File("E:\\testout.txt"));  
        writer1.write("Lebron, AD, Kuz");                                                   
        
        writer1.flush();  
        writer1.close();  
    }  
}  