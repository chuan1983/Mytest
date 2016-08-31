package tw.org.text;

public class Chuan18陣列Array認知 {

	public static void main(String[] args) {
		boolean[] d;  //這種寫法最好
		d = new boolean[3];
		for(int i=0; i<d.length;i++){
			System.out.println(d[1]);
			//System.out.println(a.length);
		}
		
		int[] a;  //這種寫法最好
		int b[];
		a = new int[3];
		b = new int[4];
		for(int i=0; i<a.length;i++){
			System.out.println(a[1]);
			//System.out.println(a.length);
			//System.out.println(b.length);
		}
		
		int[] e;  //這種寫法最好
		int f[];
		e = new int[3];
		f = new int[4];
			System.out.println(e.length);
			System.out.println(f.length);
		
		}

	}


