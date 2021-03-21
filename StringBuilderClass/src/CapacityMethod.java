
public class CapacityMethod {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append("Hello Java is my fav language");
		System.out.println(sb.capacity());

	}

}
