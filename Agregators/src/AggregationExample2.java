class Address {
	String city, state, country;

	public Address(String city, String state, String country) {
		super();
		this.city = city;
		this.state = state;
		this.country = country;
	}
	
	
}

class Employee {
	int id;
	String name;
	Address address;
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display() {
		System.out.println(id  + " " + name);
		System.out.println(address.city + " " + address.state + " " + " " + address.country);
	}
	
}
public class AggregationExample2 {

	public static void main(String[] args) {
		Address address1 = new Address("Mumbai",  "Maha",  "Ind");
		Address address2 = new Address("Del",  "Dlhi",  "India");
		
		Employee e1 = new Employee(221, "AG",  address1);
		Employee e2 = new Employee(55, "AD",  address2);
		
		e1.display();
		e2.display();

	}

}
