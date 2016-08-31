package tw.org.text;

public class Chuan20 {

	public static void main(String[] args) {
		int[] p = new int[6];   //0-5
		for(int i=0; i<10000; i++){
			int porint = (int)(Math.random()*6); //0-5
			p[porint]++;
		}
		for(int i=0; i<p.length; i++ ){
		System.out.println((i+1)+"點出現"+p[i]+"次");
		}
	}

}
