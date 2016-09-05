package tw.org.text;

import java.io.File;
import java.io.FileInputStream;

public class Chuan37 {

	public static void main(String[] args) {
//		File f1 = new File("./dir1/test.txt");    //先確認位置
//		System.out.println(f1.getAbsolutePath());
		
		File f2 = new File("dir1/test.txt");      //確認有沒有這檔案
		long len = f2.length();     //抓出長度
		if(f2.exists()){
			System.out.println("ok");
		}
		else{
			System.out.println("XX");
		}

		try{
		FileInputStream fis = new FileInputStream(f2);   //FileInputStream檔案做位元輸入的類別
			int c; 
			byte[] bty = new byte[(int)len];   //這裡陣列的長度要給整數,最大總容量2G
			c = fis.read(bty);
			System.out.println(new String(bty));
		
//			int c; byte[] bty = new byte[3];            //1..顯示test的內容,2..加入陣列判斷中文字..utf-8中文字佔"3"byte
//			while( (c = fis.read(bty))!= -1 ){          //第一種顯示
//				System.out.print(new String(bty,0,c));  //bty物件,開源0開始,C的整數總長
//			}

//			while((c=fis.read())!= -1){
//				System.out.print((char)c);           //去ln不換行,單純顯示英文字
//			}
			fis.close();
			System.out.println("OK");
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}

}
