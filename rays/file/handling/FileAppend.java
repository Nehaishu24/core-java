package in.co.rays.file.handling;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class FileAppend {
	public static void main(String[] args) throws Exception {
		FileWriter writer = new FileWriter("D://WriterSimple.txt",true);
		BufferedWriter bw = new BufferedWriter(writer);
		bw.write("I am a girl");
		bw.close();
}
}