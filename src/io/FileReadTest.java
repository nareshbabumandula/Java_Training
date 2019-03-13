package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReadTest {
	
	
	public void FileReadExample() throws IOException
	{
		String str;
		String strFilePath = "C:\\Users\\NareshBabu\\Desktop\\Test.txt";
		
		FileReader fr = new FileReader(strFilePath);
		BufferedReader br = new BufferedReader(fr);
			
		//Read line from the file till it reaches null
		while((str=br.readLine())!=null)
		{
			System.out.println(str);
		}
		br.close();
	}

	public static void main(String[] args) throws IOException {
		
		FileReadTest fr = new FileReadTest();
		fr.FileReadExample();
	
	}

}
