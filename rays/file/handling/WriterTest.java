package in.co.rays.file.handling;

import java.io.FileWriter;

public class WriterTest {
public static void main(String[] args) throws Exception {
	FileWriter w = new FileWriter("C:/Testwriter.txt");
	char[] cArray = {'H','N'};
	//w.write(cArray); //write char Array
	w.write(',');   // write a char
	//w.write("GoldenMemory"); //write string 
	w.close();
	
}
}
