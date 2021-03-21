package mypack;

import pack.A;

public class B {

	public static void main(String[] args) {
		A obj = new A();
		obj.msg();
		

		pack.A obj2 = new pack.A(); // Importing package by using fully qualified name
		obj2.msg();

	}

}
