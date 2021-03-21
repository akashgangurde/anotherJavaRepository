import java.util.ArrayList;

public class ArrayListExample9 {

	public static void main(String [] args) {
		
      ArrayList<String> al = new ArrayList<String>();
      
      al.add("Lebron");
      al.add("AD");
      al.add("Kuz");
      al.add("KCP");
      al.add("Gasol	");
      System.out.println("An initial list of elements: " + al);

      al.remove("Vijay");
      System.out.println("After invoking remove(object) method: " + al);

      al.remove(0);
      System.out.println("After invoking remove(index) method: " + al);
        
      ArrayList<String> al2=new ArrayList<String>();
      al2.add("Lebron");
      al2.add("AC");

      al.addAll(al2);
      System.out.println("Updated list : " + al);

      al.removeAll(al2);
      System.out.println("After invoking removeAll() method: " + al);

      al.removeIf(str -> str.contains("Ajay"));
      System.out.println("After invoking removeIf() method: " + al);
      al.clear();
      System.out.println("After invoking clear() method: " + al);
   }

}
