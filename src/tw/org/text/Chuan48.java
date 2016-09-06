package tw.org.text;

import java.util.Timer;
import java.util.TimerTask;

public class Chuan48 {

	public static void main(String[] args) {
		Timer time = new Timer();
		MyTask task1 = new MyTask("A");
		MyTask task2 = new MyTask("B");
		time.schedule(task1, 3000, 1000);
		time.schedule(task2, 1000, 500);
	}

}

class MyTask extends TimerTask{
	private String name;
	private int i;
	MyTask(String name){this.name = name;}
	@Override
	public void run() {
		System.out.println(name +":"+ i++);
	}
}