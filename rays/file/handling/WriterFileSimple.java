package in.co.rays.file.handling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriterFileSimple {
public static void main(String[] args) throws Exception {
	FileWriter writer = new FileWriter("D://WriterSimple.txt");
	BufferedWriter bw = new BufferedWriter(writer);
	bw.write("woow I got a job");
	bw.close();
	
}
}
