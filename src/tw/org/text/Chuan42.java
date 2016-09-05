package tw.org.text;

import java.util.TreeSet;

public class Chuan42 {

		public static void main(String[] args) {
			TreeSet set = new TreeSet(); //hsahset沒有排列功能   treeset 能排列整齊
			while(set.size()<6){
				set.add((int)(Math.random()*49+1));
			}
			System.out.println(set.toString());
		}
}
