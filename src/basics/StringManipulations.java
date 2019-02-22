package basics;

public class StringManipulations {
	
	public static void main(String[] args) {
		
		String sText1 = "hello world";
		String sText2 = "WELCOME";
		String sText3 = "this is core java";
		String sText4 = "welcome to the java training for selenium";
		
		System.out.println(sText1.toUpperCase()); // Upper case 
		System.out.println(sText2.toLowerCase()); // Lower case
		System.out.println(sText3.length()); // Length
		System.out.println(sText4.charAt(0)); // Character at position 0
		System.out.println(sText4.charAt(1)); // Character at position 1
		System.out.println(sText1.concat(" ").concat(sText2)); // Combine sTex1 with sText2
		System.out.println(sText1 + " " + sText2); // Combine sTex1 with sText2
		System.out.println(sText4.contains("selenium")); // Return true if substring found else return false
		System.out.println(sText4.substring(0, 7)); // Extract sub string between index range
		System.out.println("bikram".substring(0, 4));
		
		
		

	}

}
