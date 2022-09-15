package in.co.rays.file.handling;

import java.io.File;
import java.util.Date;

public class FileAttributes {
	public static void main(String[] args) {
		File f = new File("C:\\FileAttribute.txt");
		if (f.exists()){
			
		System.out.println("Name"+f.getName());
		System.out.println("Absolute Path"+"  "+f.getPath());
		System.out.println("Is Writable"+"  "+f.canWrite());
		System.out.println("Is Readable "+"  "+f.canRead());
		System.out.println("Is File"+"  "+f.isFile());
		System.out.println("Is Directory"+"  "+f.isDirectory());
		System.out.println("Last Modified at"+"  "+new Date (f.lastModified()));
		System.out.println("Length"+f.length()+"  "+"bytes long");
		
		}
	}
}
		
		
		
