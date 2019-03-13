package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class FileWriterTest {
	
	public void FileWriterExample() throws IOException
	{
		String str;
		String strFilePath = "C:\\Users\\NareshBabu\\Desktop\\output.txt";
		
		FileWriter fr = new FileWriter(strFilePath);
		BufferedWriter bw = new BufferedWriter(fr);
	
		//Write data into the notepad
		bw.write("hello");
		bw.newLine();
		bw.write("world");
		bw.newLine();
		bw.write("welcome to core java");
		bw.close();
	}

	public static void main(String[] args) throws IOException {
		
		FileWriterTest fw = new FileWriterTest();
		fw.FileWriterExample();
		
		
	}

}
