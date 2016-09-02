package tw.org.text;

public class Chuan30抽象類別 {

	public static void main(String[] args) {
		Chuan301 obj1 = new Chuan301();
		//Chuan302 obj2 = new Chuan302();   //因是抽象類別，無法物件實作
		Chuan302 obj3 = new Chuan303();

	}

}
	class Chuan301{
		void m1(){}
	}
	abstract class Chuan302{
		void m1(){}
		abstract void m2(); //有定義但無實作
	}
	class Chuan303 extends Chuan302{
		void m2(){System.out.println("Chuan302:m2()");}
	}
	class Chuan304 extends Chuan302{
		void m2(){System.out.println();} 
	}