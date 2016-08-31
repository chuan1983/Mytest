package tw.org.text;

public class Chuan08 {

	public static void main(String[] args) {
		int a = 10, b= 3;
		System.out.println(a/b);
		
		double e =  10, f = 0;
		System.out.println(e/f);//=>無限大
		
		int g = 1 , h = 2 ;
		int i = g & h;
		System.out.println(i); //& 2進位運算     取full  | 取true
		
		int j = 1 , k = 2 ;
		int y = j | k;
		System.out.println(y); //& 2進位運算     取full  | 取true
		
		int w = 1 , q = 3 ;
		int r = w ^ q;
		System.out.println(r); //^ 2進位運算     異性相吸 同性相斥
				
	}

}
