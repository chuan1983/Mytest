package tw.org.text;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Chuan52 {

	public static void main(String[] args) {     //先設定一個空封包 等待對方傳封包過來
		byte[] buf = new byte[1024];
		try {
			DatagramSocket socket = 
					new DatagramSocket(8889);  //設定港口port號 對方傳封包也要對應相同port號
			DatagramPacket packet = 
					new DatagramPacket(buf, buf.length);       //接收不用設定ip
			socket.receive(packet);
			socket.close();
			InetAddress urip = packet.getAddress();                //接收封包後,看對方ip 封包內容
			byte[] data = packet.getData();
			int len = packet.getLength();
			
			System.out.println(urip.getHostAddress() +":"+ 
			new String(data,0,len));
			
			
			
			System.out.println("Rac Ok");
			
		} catch (Exception e){			
			System.out.println(e.toString());
			
		}

	}

}
