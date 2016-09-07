package tw.org.text;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class Chuan53 {

	public static void main(String[] args) {
		try {
			Socket socket = 
					new Socket(InetAddress.getByName("10,1,6,91"),9999);
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
