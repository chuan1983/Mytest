package tw.org.text;

import java.io.File;

public class Chuan34 {

	public static void main(String[] args) {
		File file1 = new File("c:/king/file1");
		if(file1.isFile()){
			System.out.println("OK");
		}
		else{
			try{
			if(file1.createNewFile()){
				System.out.println("OK");
			}
			else{
				System.out.println("creat fail");
			}
			}
			catch(Exception ie){
				System.out.println("");
			}
		}
	
		File file2 = new File("c:/text/bir1");
		if(file2.isDirectory()){
			file2.mkdir();
		}
	}
}