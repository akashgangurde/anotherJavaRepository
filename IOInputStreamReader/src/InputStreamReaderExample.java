import java.io.FileInputStream;
import java.io.Reader;
import java.io.*;


public class InputStreamReaderExample {  
    public static void main(String[] args) {  
        try  {
        	
            InputStream stream = new FileInputStream("E:\\a.txt");
            Reader reader = new InputStreamReader(stream);
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }  
}  