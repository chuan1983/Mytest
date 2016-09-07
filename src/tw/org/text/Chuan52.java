package tw.org.text;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Chuan52 {

	public static void main(String[] args) {     //先設定一個空封包 等待對方傳封包過來
		byte[] buf = new byte[1024];
		try {
			DatagramSocket socket = 
					new DatagramSocket(889);  //設定港口port號 對方傳封包也要對應相同port號
			DatagramPacket packet = new DatagramPacket(buf, buf.length);       //接收不用設定ip
			
			socket.receive(packet);
			socket.close();                 
			System.out.println("Rac Ok");
			
		} catch (Exception e){			
			System.out.println(e.toString());
			
		}

	}

}
