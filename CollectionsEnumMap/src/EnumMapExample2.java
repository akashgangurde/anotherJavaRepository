import java.util.EnumMap;
import java.util.Map;

class Book {
	
	int id;  
	String name, author, publisher;  
	int quantity;
	
	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}  
	
}

public class EnumMapExample2 {
	
	public enum Key {
		One, Two, Three
	};

	public static void main(String[] args) {
		
		EnumMap<Key, Book> enumMap = new EnumMap<Key, Book>(Key.class);
		
		Book b1 = new Book(101, "Let us C","Yashwant Kanetkar", "BPB", 8);
	    Book b2 = new Book(102, "Data Communications and Networking", "Forouzan", "McGraw Hill", 4);
	    Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);

	    enumMap.put(Key.One, b1);
	    enumMap.put(Key.Two, b2);
	    enumMap.put(Key.Three, b3);
	    
	    for(Map.Entry<Key, Book> entry : enumMap.entrySet()) {
	    	Book b = entry.getValue();
	    	System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
	    }
	}

}
