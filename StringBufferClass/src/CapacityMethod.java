
public class CapacityMethod {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("Hello");
		System.out.println(sb.capacity());
		sb.append("Hello Java is my fav language");
		System.out.println(sb.capacity());

	}

}
