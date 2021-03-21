interface Bank {
	float rateOfInterest();
}

class SBI implements Bank {

	@Override
	public float rateOfInterest() {
		return 9.15f;
	}
}

class PNB implements Bank {

	@Override
	public float rateOfInterest() {
		return 15.14f;
	}
}
public class Example3 {

	public static void main(String[] args) {
		Bank bank = new SBI();
		System.out.println("ROI: " + bank.rateOfInterest());

	}

}
