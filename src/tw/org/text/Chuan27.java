package tw.org.text;

public class Chuan27 {

	public static void main(String[] args) {
		Chuan271 obj1 = new Chuan271(2);
		//obj1.m1();
		Chuan272 obj2 = new Chuan272();
		obj2.m1();
		obj2.m2();
	}
	
}
class Chuan271{
	int a;
	Chuan271(int b){
		// super()
		System.out.println("Chuan271()");
	}
	void m1(){System.out.println("Chuan271:m1()");}
}
class Chuan272 extends Chuan271{
	Chuan272(){
		// super()
		super(2);
	}
	void m1(){
		super.m1();
		System.out.println("Chuan272:m1():" + a);
	}
	void m2(){System.out.println("Chuan272:m2()");}
}

