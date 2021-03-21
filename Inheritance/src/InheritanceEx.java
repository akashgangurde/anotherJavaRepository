class Employee {
	float salary = 40000;
}

class Programmer extends Employee {
	int bonus = 5000;
}
public class InheritanceEx {

	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("salary " + p.salary);
		System.out.println("bonus " + p.bonus);

	}

}
