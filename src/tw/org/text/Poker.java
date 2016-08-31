package tw.org.text;

public class Poker {

	public static void main(String[] args) {
		//洗牌
		int[]Poker = new int [52];
		for(int i=0; i<Poker.length; i++){
		int temp ;
			//System.out.println(temp);
			
		//檢查機制
		boolean isRepeat; 
		do{
			temp=(int)(Math.random()*52);
			isRepeat = false;
				for(int j=0; j<i; j++){        //質數觀念  從第一張檢查
					if(temp == Poker[i] ){
						isRepeat = true;
							break;
					}
				}
			}while(isRepeat);
			Poker[i]=temp;
		}
		//發牌
		int[][]player = new int[4][13];
		for(int i=0; i<player.length; i++){
			player[i%4][i/4]= Poker[i];
		}
		//攤牌
		String[] suit={"黑桃","紅心","方塊","梅花"};
		String[] value={"A ","2 ","3 ","4 ","5 ","6 ","7 ",
						"8 ","9 ","10 ","J ","Q ","K "};
		for(int[] cards : player){
			for(int card:cards){
				System.out.println(suit[card/13]+value[card%13]+"("+card+") ");
			}
			System.out.println();
		}
	}
}
