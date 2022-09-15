package in.co.rays.file.handling;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class InOutputBufferStream {
public static void main(String[] args)throws Exception {
	//String source = ("C:\\Users\\jainshri\\Documents\\Testreader.txt"); 
	//String target = ("C:\\Users\\jainshri\\Documents\\empty.txt");
	BufferedInputStream reader = new BufferedInputStream(new FileInputStream("C:\\Users\\jainshri\\Documents\\BufferInput.txt"));
	BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream("C:\\Users\\jainshri\\Documents\\BufferOut.txt"));

	byte[] buff =new byte[256];
	int count = reader.read(buff);
	while(count>0) {
		writer.write(buff,0,count);
		count = reader.read(buff);
		System.out.println("Chal ja ab");
	}
	writer.close();
	reader.close();
	
}
}
