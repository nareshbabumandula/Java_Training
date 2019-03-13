package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {
	
	public void CheckedException_Demo() 
	{
		boolean bFlag =false;
		try {
			FileInputStream strFile = new FileInputStream("C:\\Users\\NareshBabu\\Desktop\\Test.txt");
			int r;
			while((r=strFile.read())!=-1)
			{
				System.out.println((char)r);
			}
			strFile.close();
			bFlag =true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally
		{
			if (bFlag) {
				System.out.println("Successfully read the data from the file");
			} else {
				System.out.println("Failed to read the data from the file");
			}
		}
	}
	
	public void CheckedException_Test() throws FileNotFoundException 
	{
		FileInputStream strFile = new FileInputStream("C:\\Users\\NareshBabu\\Desktop\\Selenium_Notes1234.txt");
	}
	
	

	public static void main(String[] args) throws IOException {
		CheckedException ce = new CheckedException();
		ce.CheckedException_Demo();
		//ce.CheckedException_Test();

	}

}
