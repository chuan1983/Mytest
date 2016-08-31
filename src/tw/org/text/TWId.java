package tw.org.text;

public class TWId {
	private String id;
	public TWId(String id){ //建構式
		this.id = id;
	}
	int getArea(){      //地方
		return 1;
	}
	//true= male false= female
	boolean getGender(){ //性別
		return id.charAt(1)==2;
	}
	static boolean isRight(String id){  //驗證方法
		boolean ret = false;
		if(id.matches("^[A-Z][12][0-9]{8}$")){
			//驗證碼比對
			String cheak = "ABCHEFGHJKLMNPQRSTUVXYWZIO";
			int pos = cheak.indexOf(id.charAt(0));
			//System.out.println(pos);
			int n12 = pos+10;
			int n1 = n12/10;
			int n2 = n12%10;
			int n3 = Integer.parseInt(id.substring(1, 2));
			int n4 = Integer.parseInt(id.substring(2, 3));
			int n5 = Integer.parseInt(id.substring(3, 4));
			int n6 = Integer.parseInt(id.substring(4, 5));
			int n7 = Integer.parseInt(id.substring(5, 6));
			int n8 = Integer.parseInt(id.substring(6, 7));
			int n9 = Integer.parseInt(id.substring(7, 8));
			int n10 = Integer.parseInt(id.substring(8, 9));
			int n11 = Integer.parseInt(id.substring(9, 10));
			int sum =n1*1+n2*9+n3*8+n4*7+n5*6+n6*5+n7*4+n8*3+n9*2+n10*1+n11*1;
			//System.out.println(sum);
			ret = sum%10==0;
			//ret = true;
		}
		return  ret;
	}
	
}
