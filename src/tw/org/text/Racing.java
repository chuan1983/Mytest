package tw.org.text;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Racing extends JFrame{
	//2
	private JButton go;
	private JLabel[] lanes;
	//1
	public Racing(){
		super ("Racing Game");
		
		setLayout(new GridLayout(9,1));
		
		
		go = new JButton("GO!");
		add(go);
		lanes = new JLabel[8];                   //建立車子在跑道上
		for(int i=0; i<lanes.length; i++){
			lanes[i] = new JLabel((i+1)+". ");
			add(lanes[i]);
		}
		
		setSize(1024,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void go(){                          //建立每台車子,
		Car[] cars = new Car[8];
		for(int i=0; i<cars.length; i++){
			cars[i] = new Car(i);
		}
		for(int i=0; i<cars.length; i++){       //跑的順序幾乎同時間
			cars[i].start();
		}
	}
	private class Car extends Thread{           //每台車子跑100
		private int num;
		Car(int num){this.num = num;}
		@Override
		public void run() {
			for(int i=0; i<100; i++){
					lanes[num].setText(lanes[num].getText()+">");
					try {
						Thread.sleep((int)(Math.random()*200));
					} catch (InterruptedException e) {
				}
			}
		}
	}
	public static void main(String[] args) {
		new Racing();
	}

}
