package tw.org.text;

public class Chuan26連結TWId {

	public static void main(String[] args) {
		TWId id = new TWId(true,4);
		System.out.println(id.getId());
		if (TWId.isRight(id.getId())){
			System.out.println("OK");
		}else{
			System.out.println("XX");
		}
	}
}
