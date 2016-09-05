package tw.org.text;

public class Chuan35 {

	public static void main(String[] args) {
		Chuan330 obj = new Chuan330();
		obj.m1();

	}

}
	class Chuan330 {                            //分別去試return 有寫沒寫的差別
		void m1(){
			int a = 10, b = 3;
			try{
				System.out.println(a/b);
				return;
			}
//			catch(Exception e){
//				System.out.println("catch");
//				return;
//			}
			finally{
				System.out.println("finally");
			}
			//System.out.println("Gmane Over");
		}
	}
