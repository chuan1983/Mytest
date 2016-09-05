package tw.org.text;

import java.util.HashSet;


public class Chuan43 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(12);	// int = Auto-Boxing => Integer
		set.add("Brad");
		set.add(12.3);
		set.add(new Student("Brad",1,2,3));
		set.add(new Student("Brad",1,2,3));
		set.add("Brad");
		set.add(12);
		System.out.println(set.size());
		System.out.println(set.toString());
		

	}

}
