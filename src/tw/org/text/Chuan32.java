package tw.org.text;

public class Chuan32 {
		public static void main(String[] args) {
			Bird b1 = new Bird();
			try{
				//b1.setLeg(2);
				b1.setLeg(-2);
			}catch(Exception ee){        //原本try{}catch是要包住下面那段例外，但如果包覆在這段結果是要交給開發者去處理
				//
			}
		}
	}
	class Bird {
		int leg;
		void setLeg(int n) throws Exception {
			if (n<0 || n>2){
				throw new RuntimeException();     //當小於0或大於0 執行這段例外
			}
			leg = n;
		}
	}
//	class Bird {                           //第一步
//		int leg;
//		void setLeg(int n)  {
//			leg = n;
//		}
//	}
	
	