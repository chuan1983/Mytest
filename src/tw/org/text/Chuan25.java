package tw.org.text;

public class Chuan25 {

	public static void main(String[] args) {
	String s1 = "Chuan";
	String s2 = "Chuan";
	String s3 = new String("Chuan");
	String s4 = new String("Chuan");
	System.out.println(s1==s2);
	System.out.println(s3==s4);
	System.out.println(s3.equals(s4));  //Bike.java
	Bike b1 = new Bike();
	Bike b2 = new Bike();
	System.out.println(b1.equals(b2));  //Bike.java
	}

}
