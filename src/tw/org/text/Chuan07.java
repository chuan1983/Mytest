package tw.org.text;

public class Chuan07 {

	public static void main(String[] args) {
		byte a= 10, b = 3;
		int c = a + b; //在java裡+-/*,有byte , short , int 以int 為運算值中心，有byte , short , in , long 以long
		int d = a + b; //=>3
		double e = a / b; //=>3.0 因為前面的值是int(整數) 所以取3 而double是有小數點的
		System.out.println(e);
		
		double f = 10 , g = 3; //有float double以double為運算值中心
		double h = f/g;
		System.out.println(h);
		
		
	}

}
