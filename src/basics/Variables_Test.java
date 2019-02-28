package basics;

public class Variables_Test {

	String APPURL = "http://www.amazon.com"; //Class variable/Instance variable
	
	static String ADMINUSER = "Sourabha"; //Static variable/Global variable
	
	//Method/Function
	public void Login()
	{
		String USERNAME = "sandhya"; // USERNAME - Local variable or method variable
		System.out.println(USERNAME);
		System.out.println(APPURL); //Class variable
		System.out.println(ADMINUSER); //Static variable
	}
	
	public void AccessSite()
	{
		System.out.println(APPURL);
		System.out.println(ADMINUSER); //Static variable
	}
	
	
	//Main method
	public static void main(String[] args) {
	
		//Class name objName = new Constructor Name(); (Constructor name will be same as class name)
		Variables_Test vt = new Variables_Test(); //Create an object for a class
		vt.Login();
		System.out.println(ADMINUSER); //Static variable
		System.out.println(vt.APPURL);
		System.out.println(ADMINUSER);
		
	}

}
