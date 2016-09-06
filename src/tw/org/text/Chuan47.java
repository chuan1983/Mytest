package tw.org.text;

public class Chuan47 {

	public static void main(String[] args) {
		Chuan471 obj1 = new Chuan471("A");
		Chuan471 obj2 = new Chuan471("B");
		Chuan471 obj3 = new Chuan471("C");
		Chuan472 obj4 = new Chuan472("D");
		Thread t1 = new Thread(obj4);      //這裡t1才是主程序  
		obj1.start();         //start是Thread父類別的方法,用run的方式呈現生命的方法跑下去
		obj2.start();         //Start只能有一條生命,無法重複跑
		obj3.start();
		t1.start();           //t1才能呼叫start方法,  而單純用obj4的話只能有run可以呼叫
		
		//obj1.run(); //可以跑很多次
		
		try {                   
			Thread.sleep(500);          //讓主程序睡500 下面 用break讓obj2在迴圈提前結束
		} catch (InterruptedException e) {
		}
		System.out.println("Main");
		obj2.interrupt();
	}

}
class Chuan471 extends Thread{                   //java只能繼承一種  不能多種  
	String name;                                 //產生建構式
	Chuan471(String neme){this.name = neme;}     //產生建構式
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(name +":"+ i);
			try {
				Thread.sleep(100);           //會出現例外因為會睡到一半被其他程式呼叫
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}
class Chuan472 implements Runnable{              //用一般物件  這裡還能繼承其他方法 用法比較彈性
	String name;                                 
	Chuan472(String neme){this.name = neme;}     
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(name +":"+ i);
			try {
				Thread.sleep(100);           
			} catch (InterruptedException e) {
				break;
			}
		}
	}
}