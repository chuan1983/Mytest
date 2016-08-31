package tw.org.text;

public class Bike {
	private double speed;       //這裡雖然建立成功，其值為0.0    private 封裝speed這個屬性
	private int color;
	Bike(){                     //建構式方法沒有傳回值,不能用void,取名大小寫要跟Class的名稱一樣
		System.out.println("Bike()");
		color=2;
	}
	Bike(int c){				//另一種建構式
		System.out.println("Bike(int)");
		color=c;
	}
	void upSpeed(){
		speed = (speed<1?1:speed*1.2);
	}
	void upSpeed(int gear){                //加速屬性
		speed = (speed<1?1:speed*1.2+gear);
	}
	void downSpeed(){
		speed = (speed<0?1:speed*0.7);
	}
	double getSpeed(){            //get 傳回才能有辦法呼叫
		return speed;
	}
	@Override
	public String toString() {
		return "Chuan Bike";
	}
	@Override
	public boolean equals(Object obj) {
		return true;
	}
	
}
