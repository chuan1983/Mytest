package tw.org.text;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Chuan57 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://10.1.6.65/addData.php?cname=jack&tel=8888&birthday=2016-9-8");  //資料傳到mysql資料庫  
			//URLConnection conn = url.openConnection();  //拿到url.OC 傳回前面URLC conn
			//這裡把上面的強制轉型下面的
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			
			conn.connect();     //連接http
			conn.getInputStream();

			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
