package in.co.rays.file.handling;

import java.io.FileWriter;
import java.io.PrintWriter;

public class WriterFileForLoop {
public static void main(String[] args) throws Exception {
	FileWriter w = new FileWriter("D:/empty.txt");
	PrintWriter pw = new PrintWriter(w);
	for(int i=0; i<5; i++) {
		pw.println(i+":Line");
		}
	System.out.println("hiiiii");
		pw.close();
		w.close();
		//System.out.println("File is Successfully Written,plz Check C:/Testwriter.txt");
}
}