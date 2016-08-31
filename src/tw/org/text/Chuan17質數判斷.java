package tw.org.text;

public class Chuan17質數判斷 {

	public static void main(String[] args) {  //只能被1和自己整除 為質數
		for(int i=1;i<=100;i++ ){
			boolean isP = true;
			for(int j=2;j<=i/2;j++){   //j為何等於2??  因為只能被1和自己整除 所以從2開始計算 
				if(i%j==0){
					isP = false;
					break;
				}
			}
			System.out.print(i+(isP?"*":" ")+" ");
			if(i%10==0)
				System.out.println();
		}
	}

}
