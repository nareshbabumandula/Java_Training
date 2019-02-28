package oops;

public class ClassC extends ClassB{
	
	public void CheckoutProduct()
	{
		System.out.println("CheckoutProduct AccessSite method...");
	}
	

	public static void main(String[] args) {
		ClassC cc = new ClassC();
		cc.AccessSite();
		cc.Login();
		cc.SearchProduct();
		cc.AddToCart();
		cc.CheckoutProduct();
		System.out.println(cc.USERNAME);
		System.out.println(cc.PASSWORD);

	}

}
