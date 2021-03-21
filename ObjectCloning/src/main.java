
public class main implements Cloneable {
	
	int rollNo;
	String name;

	public main(int tollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public static void main(String[] args) {
		try {
			main s1 = new main(111, "amit");
			
			main s2 = (main) s1.clone();
			
			System.out.println(s1.rollNo+" "+s1.name);  
			System.out.println(s2.rollNo+" "+s2.name);
		} catch (CloneNotSupportedException c) {
			
		}
	}

}
