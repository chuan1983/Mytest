package tw.org.text;

public class Chuan05 {

	public static void main(String[] args) {
		char a = 97; //ASCII:
		char b = a;  //上面案AIT+數字97以上會出現英文字
		System.out.println(b);
		
		char c = '資';//一個中文字 = 一個字元
		System.out.println(c);
		
		int d = b;
		System.out.println(d);
		int e = a+b;
		System.out.println(e);

	}

}
