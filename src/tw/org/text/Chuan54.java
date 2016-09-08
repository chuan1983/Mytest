package tw.org.text;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Chuan54 {

	public static void main(String[] args) {
		try {
			ServerSocket sever = 
					new ServerSocket(9988);
			Socket socket = sever.accept();
						
			FileOutputStream fout = 
					new FileOutputStream("upload/chuan.jpg");
			InputStream in = socket.getInputStream();
			int c;
			while((c = in.read())!= -1){
				fout.write(c);
			}
			fout.flush();
			fout.close();
			in.close();
			socket.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
