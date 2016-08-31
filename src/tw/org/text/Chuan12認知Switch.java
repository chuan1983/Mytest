package tw.org.text;

public class Chuan12認知Switch {

	public static void main(String[] args) {
		int a = 10;
		final int b = 10;
		switch(a){                     //switch 只能判定的形別  byte short int   long不能判定
		case 1:                                          //char
			System.out.println("A");                     //string
			break;
		case 10:
			System.out.println("B");
			//break;
		case b+2:                         //case 不能使用變數,只能用常數.如要使用b int前+final 指定為常數不能變動即可
			System.out.println("C");      //case 常數不能相同 
			break;
		default:
			System.out.println("D");
			break;
			
		}
		
		
		String f = "A";
		switch(f){                      //字串使用
		case "1":                                          
			System.out.println("A");                     
			break;
		case "10":
			System.out.println("B");
			break;
		case "100":
			System.out.println("C");
			break;
		default:
			System.out.println("D");
			break;			
		}
		
	}

}
