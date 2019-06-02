package oops;

public class ClassB extends ClassA {
	
		
	public void AddToCart()
	{
		System.out.println("Executing AddToCart method...");
	}

	public static void main(String[] args) {
		ClassB cb = new ClassB();
		cb.AccessSite();
		cb.Login();
		cb.SearchProduct();
		cb.AddToCart();
		System.out.println(cb.USERNAME);
		System.out.println(cb.PASSWORD);
	
	}

}
