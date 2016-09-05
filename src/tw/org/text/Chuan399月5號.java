package tw.org.text;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Chuan399月5號 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout =
				new FileOutputStream("dir1/test1.txt", true);   //true能夠新增
			fout.write("1234567\n7654321\nabcdefg".getBytes());  //一定要加.getBytes
			fout.flush();
			fout.close();
			System.out.println("Write OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		
	}

}
