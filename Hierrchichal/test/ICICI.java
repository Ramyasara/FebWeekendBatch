package Hierrchichal.test;

public class ICICI extends RBI {
	public void ICICIacc() {
	System.out.println("ICICI Account Number is 123456");

	}
	public void ICICIAccName() {
		System.out.println("ICICI Account Name is Shyam");

	}
	public static void main(String[] args) {
		ICICI ic = new ICICI();
		ic.ICICIacc();
		ic.ICICIAccName();
		ic.Adharid();
		ic.Panid();
	}

}
