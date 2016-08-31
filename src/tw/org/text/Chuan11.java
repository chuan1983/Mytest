package tw.org.text;

public class Chuan11 {

	public static void main(String[] args) {
		int a = 10 ,b = 3;
		if(++a<=10 & --b>=3){  //++ --在前先判斷在執行a，反之++ --在後先判斷a在執行++ --
			System.out.println("ok:a="+a+";b="+b);
		}else{
			System.out.println("XX:a="+a+";b="+b);
		}
//		if(++a<=10 && --b>=3){
//			System.out.println("ok:a="+a+";b="+b);
//		}else{
//			System.out.println("XX:a="+a+";b="+b);
//		}
//		if(a++<=10 && b-->=3){
//			System.out.println("ok:a="+a+";b="+b);
//		}else{
//			System.out.println("XX:a="+a+";b="+b);
//		}
//		if(a<=10 && b>=3){
//			System.out.println("ok");
//		}else{
//			System.out.println("XX");
//		}
	}

}
