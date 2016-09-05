package tw.org.text;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Chuan41寫 {

	public static void main(String[] args) {
		Student s1 = new Student("Chuan",76, 54, 43);
		System.out.println(s1.getScore());
		System.out.println(s1.getAvg());
		try {
			ObjectOutputStream oout = 
					new ObjectOutputStream( new FileOutputStream("dir1/s.dat"));
			oout.writeObject(s1);;
			oout.flush();
			oout.close();
		} catch (IOException e) {
			System.out.println("Exception"+e.toString());
		} 
		
	}
}			
	class Student implements Serializable{               //加上implements Serializable讓整段物件實作序列化
		int ch, eng, math;
		String name;
		Student(String name,int ch, int eng, int math){
			this.name = name;
			this.ch = ch; this.eng = eng; this.math = math;
		}
	
	int getScore(){return ch+eng+math;}     //總分
	double getAvg(){return getScore()/3.0;}  //平均
	}

