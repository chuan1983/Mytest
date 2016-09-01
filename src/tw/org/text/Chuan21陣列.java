package tw.org.text;

public class Chuan21陣列 {

	public static void main(String[] args) {
		int[][]a;
		int[]b[];
		int c[][];
		a = new int[3][4];
		b = new int[3][];
		//c = new int[][];  //第一維一定要有定義
		b[0] = new int[2];  //b陣列底下的
		b[1] = new int[3];
		b[2] = new int[4];
		
		b[0][1]=1;
		b[1][2]=2;
		b[2][3]=3;
				
//		for(int i=0; i<b.length; i++){
//			for(int j=0; j<b[i].length; j++){
//				System.out.print(b[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		
		for(int[]v:b){                    //d為2維陣列   v是d陣列底下的一維陣列
			for(int k:v){
				System.out.print(k+" ");
			}
			System.out.println();		
		}
		
		
		System.out.println("------");
		int[]d = new int[3];
		for(int v:d){                    //d為2維陣列   v是d陣列底下的一維陣列
			System.out.println(v);
		}
	
		System.out.println("-----");
		int[]e = new int[]{1,2,3,4,5};
		int[]f = {1,2,3,4,5};
		System.out.println(f.length);
		System.out.println(f[2]);
	}
}
