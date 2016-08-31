package tw.org.text;

public class Chuan10 {

	public static void main(String[] args) {
		double temp = Math.random();
		int year = (int) (temp * 2000 + 1);
		System.out.println(year);
		if (year % 4 == 0) {   //可被4整除
			if (year % 100 == 0) {  //可被100整除
				if (year % 400 == 0) {   //可被400整除
					System.out.println("閏年");// 29
				} else {
					System.out.println("非閏年");// 28
				}
			} else {
				System.out.println("閏年");// 29
			}
		} else {
			System.out.println("非閏年");// 28
		}
	}

}
