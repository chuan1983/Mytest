package tw.org.text;

public class Chuan16迴圈For {

	public static void main(String[] args) {
		Chuan:                               //標籤敘述句跟著迴圈標敘述句
		for(int j = 5; j>0; j--){
			for(int i = 0; i<5; i++){
				System.out.println(i+":"+j);
				if(i==3)
					break Chuan;
			}
		}

	}

}
