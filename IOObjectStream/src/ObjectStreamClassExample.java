import java.io.ObjectStreamClass;

import java.util.Calendar;  

public class ObjectStreamClassExample {

	public static void main(String[] args) {
		

		ObjectStreamClass osc = ObjectStreamClass.lookup(Calendar.class);
		  
        System.out.println("" + osc.getField("price"));
  
        ObjectStreamClass osc2 = ObjectStreamClass.lookup(String.class);
  
        System.out.println("" + osc2.getField("hash"));
		
	}

}
