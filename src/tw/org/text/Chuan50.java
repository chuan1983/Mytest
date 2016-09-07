package tw.org.text;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Chuan50 {

	public static void main(String[] args) {
		try {
			InetAddress ip = InetAddress.getByName("www.microsoft.com");
			System.out.println(ip.getHostAddress());
		} catch (UnknownHostException e) {
			System.out.println(e.toString());
		} 

	}

}
