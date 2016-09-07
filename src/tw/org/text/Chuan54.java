package tw.org.text;

import java.io.IOException;
import java.net.ServerSocket;

public class Chuan54 {

	public static void main(String[] args) {
		try {
			ServerSocket sever = new ServerSocket(9999);
			sever.accept();
			System.out.println("befor");
			sever.close();
			System.out.println("after");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
