package tw.org.text;

import javax.swing.JOptionPane;

public class Chuan27猜數字 {

	public static void main(String[] args) {
		//1.create Answer
		String answer = createAnswer(5);
		System.out.println(answer);
		
		//2.start game
		boolean isWINNER = false;
		for(int i = 0; i<3; i++){		
		
		//3.Guess
		String guess = JOptionPane.showInputDialog("Input");
		
		//4.cheak ?A?B
		if(guess.equals(answer)){
			isWINNER = true;
			break;
		}	
		String result = checkAB(answer,guess);
		JOptionPane.showInternalMessageDialog(null, 
				guess +":"+ result);
		}
		
		//5.Winner/Loser
				if(isWINNER){
					JOptionPane.showConfirmDialog(null, "恭喜老爺");
				}else {
					JOptionPane.showConfirmDialog(null, "魯蛇一條:"+answer);
				}
	}		
	static String createAnswer(int n){
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
		//Poker[0] Poker[1] Poker[2]
		//return ""+Poker[0]+ Poker[1]+ Poker[2];
		String ret = "";
		for(int p : Poker)ret += p;
		return ret;
	}
	static String checkAB(String a, String g){
		int A, B; A = B = 0;
		for(int i =0; i<g.length(); i++){
			if(g.charAt(i)==a.charAt(i)){
				A++;
			}else if(a.indexOf(g.charAt(i))!=-1){
				B++;
			}
		}
		return A + "A" + B + "B";
	}
}
