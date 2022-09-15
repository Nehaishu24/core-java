package in.co.rays.file.handling;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderTest {
public static void main(String[] args) throws Exception {
	
	FileReader reader = new FileReader("C:/Testreader.txt"); 
	BufferedReader br = new BufferedReader(reader);
	String line = br.readLine();  //read line
     
	while(line != null) {
		
	System.out.println(line);
	line = br.readLine();
	}
	reader.close();
}
}
