package tw.org.text;

public class Chuan99乘法表 {

	public static void main(String[] args) {
		for(int k=0;k<3;k++){             //3代表層數
			for(int j=1;j<=9;j++){
				for(int i=2;i<=9;i++){    //2~9的意思
					int newi =i+k*8;      //8為2~9共8列
					int result =newi*j;
					System.out.print(newi+" x "+j+" = "+result+"\t\t");  //ln拿掉可列 
				}
				System.out.println();
			}
			System.out.println("--------");
		}
	}

}
