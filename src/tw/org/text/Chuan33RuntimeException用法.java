package tw.org.text;

public class Chuan33RuntimeException用法 {

	public static void main(String[] args) {
		int a = 10,b = 0;
		int[] d = {1,2,3,4};
		try{
		int c = a/b;
		System.out.println(c);
		System.out.println(d[4]);
		}
		catch(ArrayIndexOutOfBoundsException ae){ //因陣列和數學是旁系關係 所以無先後順序
			System.out.println("Chuan1");         
		}
		catch(ArithmeticException ae){     //因為先碰到數學執行錯誤,所以先執行數學的，而執行錯誤的順序因為是直系關係所以子類別要先,父類別在後      
			System.out.println("Chuan");
		}
		catch(RuntimeException re){        //先後關係要看java api 
			System.out.println("ok");	   //re ae 變數名稱
		}	
		System.out.println("Game Over");
	}
}
