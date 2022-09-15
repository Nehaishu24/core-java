package in.co.rays.file.handling;

import java.io.FileReader;

public class ReaderTest {
public static void main(String[] args) throws Exception {
	FileReader  reader = new FileReader("C:/Testreader.txt");
	int ch=reader.read();
	char chr; 
	// ch is (-1) if no more char is left in file  
	while (ch!=-1) {
		chr =(char) ch; //Type cast to char
		System.out.println(chr);
		ch = reader.read(); //Read next character
	}
	reader.close();
}

}
