package MultiLevelInherit.test;

public class Colleage3 extends colleage2 {
	public void ColleageName2() {
		System.out.println("Colleage Name is Thyagaraya");
	}
	public void ColleageAddress2() {
		System.out.println("Colleage Address Washermenpet");

	}
	public static void main(String[] args) {
		Colleage3 c = new Colleage3();
		c.ColleageName();
		c.ColleageAddress();
		c.ColleageName1();
		c.ColleageAddress1();
		c.ColleageName2();
		c.ColleageAddress2();
	}
}
