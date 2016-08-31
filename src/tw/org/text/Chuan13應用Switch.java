package tw.org.text;

public class Chuan13應用Switch {

	public static void main(String[] args) {
		int month = 5;
		switch(month){            //先想結果要如何分類,在想過程....
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:                        
			System.out.println("31dady");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30dady");
			break;	
		case 2:
			System.out.println("28dady");
			break;
		}

	}

}
