class Bank {
	float getRateOfIntrest() {
		return 0;
	}
}

class SBI extends Bank {
	float getRateOfIntrest() {
		return 5;
	}
}

class ICICI extends Bank {
	float getRateOfIntrest() {
		return 10;
	}
}

class Axis extends Bank {
	float getRateOfIntrest() {
		return 15;
	}
}

public class Demo2 {

	public static void main(String[] args) {
		Bank bank;
		
		bank = new SBI();
		System.out.println("SBI ROI = " + bank.getRateOfIntrest());
		
		bank = new ICICI();
		System.out.println("ICICI ROI = " + bank.getRateOfIntrest());
		
		bank = new Axis();
		System.out.println("Axis ROI = " + bank.getRateOfIntrest());

	}

}
