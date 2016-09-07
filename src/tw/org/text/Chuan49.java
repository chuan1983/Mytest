package tw.org.text;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Chuan49 extends JFrame{
	private MyGame gameview;
	
	public Chuan49(){
		setLayout(new BorderLayout());
		gameview = new MyGame();
		add(gameview, BorderLayout.CENTER);
		
		
		setSize(680, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public class MyGame extends JPanel{
		private Timer timer;
		private int viewW, viewH;
		//private int ballX, ballY;
		private LinkedList<Ball> balls;
		private Color[] colors = {Color.red, Color.green, Color.yellow, Color.blue, Color.black};
		
		MyGame(){
			timer = new Timer(); 
			timer.schedule(new TimerTask() {				
				@Override
				public void run() {
					repaint();
				}
			}, 1000, 70);        //球動幾秒
			
			balls = new LinkedList<>();
			addMouseMotionListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					balls.add(new Ball(e.getX(),e.getY(),40,40,10,10,colors[(int)(Math.random()*5)]));
				}
			});
		}
//		private class ViewTask extends TimerTask{
//			@Override
//			public void run() {
//				//ballX += 10; ballY +=10;     //精細度
//				repaint();
//			}
//		}
		private class Ball{                           //設計多粒球成物件形式
			private int x, y, w, h, dx, dy;
			private Color color;
			private Timer timer;
			Ball(int x, int y, int w, int h, int dx, int dy, Color color){
				this.x=x; this.y=y; this.w=w; this.h=h;
				this.color=color;
				this.dx=dx; this.dy=dy;
				
				timer = new Timer();
				timer.schedule(new BallTask(), 0, 40);
			}
			private class BallTask extends TimerTask{
				@Override
				public void run() {
					if(x < 0 || x+w > viewW){
						dx *= -1;
					}
					if(y < 0 || y+h > viewH){
						dy *= -1;
					}
					x += dx; y += dy;				
				}
			}
		}               
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D)g;
			
			viewW = getWidth(); viewH = getHeight();
			
			for (Ball myBall : balls){
				g2d.setColor(myBall.color);
				g2d.fillOval(myBall.x, myBall.y, myBall.w, myBall.h);
			}
		}
	}
	public static void main(String[] args) {
		new Chuan49();

	}

}
