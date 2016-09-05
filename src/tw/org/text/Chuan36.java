package tw.org.text;

import java.io.File;
import java.io.FileReader;

public class Chuan36 {

	public static void main(String[] args) {
		File f1 = new File("dir1/brad.txt");
		try {
			FileReader reader = new FileReader(f1);
			int c;
			while ( (c = reader.read()) != -1){
				System.out.print((char)c);
			}
			reader.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}
