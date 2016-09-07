package tw.org.text;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Chuan51 {

	public static void main(String[] args) {
		String data = "Hello word";
		byte[] buf = data.getBytes();
		try {
			DatagramSocket socket = 
					new DatagramSocket();
			DatagramPacket packet = 
					new DatagramPacket(buf, buf.length, 
							InetAddress.getByName("10.1.6.65"), 8888);
			socket.send(packet);
			socket.close();
			System.out.println("Send Ok");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
