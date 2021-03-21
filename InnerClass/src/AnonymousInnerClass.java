abstract class Person {
	abstract void eat();
}
public class AnonymousInnerClass {

	public static void main(String[] args) {
		Person person = new Person() {
			
			@Override
			void eat() {
				System.out.println("Nice fruits");
				
			}
		};
		
		person.eat();

	}

}
