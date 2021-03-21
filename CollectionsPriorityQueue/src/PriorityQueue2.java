import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

class Book implements Comparable<Book> {
	
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

	@Override
	public int compareTo(Book b) {
		if (id > b.id) {
			return 1;
		} else if (id < b.id) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class PriorityQueue2 {

	public static void main(String[] args) {
		
		Queue<Book> queue = new PriorityQueue<Book>();
		
		Book b1 = new Book(121, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(233, "Operating System", "Galvin", "Wiley", 6);
		Book b3 = new Book(101, "Data Communications & Networking", "Forouzan", "McGraw Hill", 4);
		
		queue.add(b1);
		queue.add(b2);
		queue.add(b3);
		
		System.out.println("Traversing the queue elements: ");
		
		for(Book b : queue) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}
		
		queue.remove();
		
		System.out.println("After removing one record: ");
		
		for(Book b : queue) {
			System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.quantity);
		}

	}

}
