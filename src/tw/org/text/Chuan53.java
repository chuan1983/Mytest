package tw.org.text;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Chuan53 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		try {
			Socket socket = 
					new Socket(InetAddress.getByName("10.1.6.91"),9999);
			
			FileInputStream fin = 
					new FileInputStream("dir1/images.jpg");
			OutputStream out = socket.getOutputStream();
			
			int b;
			while((b=fin.read())!= -1){
			out.write(b);	
			}
			
			fin.close();
			out.flush();
			out.close();			
			socket.close();
			System.out.println(System.currentTimeMillis()-start);
			System.out.println("ssnd ok");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
