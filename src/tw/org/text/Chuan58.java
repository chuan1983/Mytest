package tw.org.text;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Chuan58 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://10.1.6.65/query.php");       //連結php網頁
			//URLConnection conn = url.openConnection();  //拿到url.OC 傳回前面URLC conn
			//這裡把上面的強制轉型下面的
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			
			conn.connect();     //連接http
//			InputStream in = conn.getInputStream();	//連接IO		
//			in.close();
			//上面改成下面
			BufferedReader reader = new BufferedReader(new InputStreamReader(           //connt傳到new I
					conn.getInputStream()));
			
			String line;      //這裡是字串 所以下面要等於空值   而不是用-1
			while((line = reader.readLine())!= null){
				String[] data = line.split(":");                   				//用split切割對應的":"
				System.out.println(data[0] +"-"+ data[1] +"-"+ data[2]);     	//對應query.php echo給的值
			}
			reader.close();
		} catch (Exception e) {

		}

	}

}
