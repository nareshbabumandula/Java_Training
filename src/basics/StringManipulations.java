package basics;

public class StringManipulations {
	
	public static void main(String[] args) {
		
		String sText1 = "hello world";
		String sText2 = "WELCOME";
		String sText3 = "this is core java";
		String sText4 = "welcome to the java training for selenium";
		String sText5 = "               selenium         ";
		String sText6 = "";
		String sText7 = "welcome to core java training to learn selenium with java";
		
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
		System.out.println(sText5.trim()); // Remove the spaces from either sides of the string
		System.out.println(sText4.startsWith("welcome123")); // Return true/false
		System.out.println(sText6.isEmpty()); // Return true/false
		System.out.println(sText3.endsWith("java")); // Return true/false
		System.out.println(sText7.lastIndexOf("java")); // Return index number
		System.out.println(sText7.indexOf('w')); // Return index number for the character
		System.out.println(sText7.replace('j', 'J')); // Replace char with a new char
		System.out.println(sText7.replace("java", "JAVA")); // Replace old substring with a new string
		System.out.println(sText7.replaceAll(sText7, "welcome to java")); // Replace old string with a new string
		System.out.println(sText7.replaceFirst("java", "JAVA")); // Replace the first occurence of the sub string with the new string
		String[] asText = sText7.split(" ");
		System.out.println(asText[3]);
		System.out.println("Length of the array is : " + asText.length);
		for (int i = 0; i < asText.length; i++) {
			System.out.println(asText[i]); // Print all values from an array
		}
		System.out.println(sText7.join(">", asText)); // Replaces and joins the string with a new delimiter
	}

}
