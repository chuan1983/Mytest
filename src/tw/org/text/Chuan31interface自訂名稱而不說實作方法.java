package tw.org.text;

public class Chuan31interface自訂名稱而不說實作方法 {

	public static void main(String[] args) {
		Chuan292 obj1 = new Chuan292();
		Chuan293 obj2 = new Chuan293();
		
		Chuan294 obj3 = new Chuan294();
		obj3.m3(obj2);

	}
}
	//介面寫法跟類別很像，自訂的名稱裡,方法自訂但不說如何實作
	interface Chuan291{
		void m1();
		void m2();
	}
	//292對外宣告要做291的方法,要如何做292自己定義,實作介面的方法要加public
	class Chuan292 implements Chuan291{
		public void m1(){System.out.println("Chuan292:m1()");}
		public void m2(){System.out.println("Chuan292:m2()");}
	}
	class Chuan293 implements Chuan291{
		public void m1(){System.out.println("Chuan293:m1()");}
		public void m2(){System.out.println("Chuan293:m2()");}
	}
	//引用291的方法,意思就像有這張證照但不限任何人
	class Chuan294{
		void m3(Chuan291 b){
		b.m1();	
		}
	}

