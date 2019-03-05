package oops;

public class EncapsulateSubclass extends EncapsulateTest{

	public static void main(String[] args) {
		EncapsulateSubclass es = new EncapsulateSubclass();
		es.setUSERNAME("Usha");
		System.out.println(es.getUSERNAME());
		es.setPASSWORD("java123");
		System.out.println(es.getPASSWORD());

	}

}
