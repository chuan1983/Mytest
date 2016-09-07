package tw.org.text;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Chuan54 {

	public static void main(String[] args) {
		try {
			ServerSocket sever = new ServerSocket(9999);
			Socket socket = sever.accept();
			
			InputStream in = socket.getInputStream();
			in.close();
					
			sever.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
