package tw.org.text;

import java.util.LinkedList;

public class Chuan45 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(1,3);
		list.add(0,4);
		//語法雖沒有錯誤 但是裡面只有5個數字所以沒辦法跑到第7個去  執行會出現錯誤
		list.add(7,5);
		System.out.println(list.toString());

	}

}
