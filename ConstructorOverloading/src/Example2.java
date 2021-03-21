class Bank {
	int getReturnOfIntrest() {
		return 0;
	}
}

class SBI extends Bank {
	int getReturnOfIntrest() {
		return 8;
	}
}

class ICICI extends Bank {
	int getReturnOfIntrest() {
		return 10;
	}
}

class Axis extends Bank {
	int getReturnOfIntrest() {
		return 5;
	}
}

public class Example2 {

	public static void main(String[] args) {
		
		Axis axis = new Axis();
		
		ICICI icici = new ICICI();
		
		SBI sbi = new SBI();
		
		System.out.println("Axis return of intrest = " + axis.getReturnOfIntrest());
		System.out.println("ICICI return of intrest = " + icici.getReturnOfIntrest());
		System.out.println("SBI return of intrest = " + sbi.getReturnOfIntrest());
	}
}
