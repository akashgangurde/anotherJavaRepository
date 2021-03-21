class ParentClass {
	
}
public class DowncastingWithoutInstanceOf extends ParentClass {
	
	static void method(ParentClass parentClass) {
		
		DowncastingWithoutInstanceOf downcastingWithoutInstanceOf = (DowncastingWithoutInstanceOf) parentClass;
		System.out.println("ok downcasting performed");
	}

	public static void main(String[] args) {
		
		ParentClass parentClass = new DowncastingWithoutInstanceOf();
		DowncastingWithoutInstanceOf.method(parentClass);

	}

}
