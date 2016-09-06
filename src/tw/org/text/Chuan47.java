package tw.org.text;

public class Chuan47 {

	public static void main(String[] args) {
		Chuan471 obj1 = new Chuan471("A");
		Chuan471 obj2 = new Chuan471("B");
		Chuan471 obj3 = new Chuan471("C");
		obj1.start();         //start是Thread父類別的方法,用run的方式呈現生命的方法跑下去
		obj2.start();
		obj3.start();
	}

}
class Chuan471 extends Thread{
	String name;                                 //產生建構式
	Chuan471(String neme){this.name = neme;}     //產生建構式
	@Override
	public void run() {
		for(int i=0; i<10; i++){
			System.out.println(name +":"+ i);
			try {
				Thread.sleep(100);           //會出現例外因為會睡到一半被其他程式呼叫
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}