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

public class Chuan56 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://pdfmyurl.com?url=https://www.gamer.com.tw/");  //例2.  網址轉成pdf
			//例1. URL url = new URL("http://a.ecimg.tw/pic/v1/data/item/201609/D/S/A/B/0/3/DSAB03-A9007E07P000_57d0c392ad024.jpg");       //url物件實體化    這邊的檔案內容是jpg原始檔所以是圖檔
			//URLConnection conn = url.openConnection();  //拿到url.OC 傳回前面URLC conn
			//這裡把上面的強制轉型下面的
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			
			conn.connect();     //連接http
			InputStream in = conn.getInputStream();
			FileOutputStream fout = new FileOutputStream("dir1/chuan3.pdf");  //載回來的圖檔存到dir1
			
			byte[]buf = new byte[4096];     	//設定陣列的大小
			int len;                         	//長度
			while((len = in.read(buf))!= -1){	//迴圈讀取圖檔 
				fout.write(buf,0,len);
			}
			
			fout.flush();
			fout.close();
			in.close();
			System.out.println("ok");
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
