package tw.org.text;

public class Text {

	public static void main(String[] args) {
		String a ="abcdefg";
		char b = 1;
		System.out.println(a.charAt(3)==b);
		System.out.println(a.length());
		
		System.out.println("------");
		
		//TWId b1 = new TWId ("A123456789"); //因為前面boolean + ststic
		if(TWId.isRight("A123456789")==true){
			System.out.println("ok");
		}else
			System.out.println("xx");
		
		System.out.println("----");
		
		String d = "baedchao";
		System.out.println(d.substring(1,4));
		
	}	

}
