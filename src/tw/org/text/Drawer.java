package tw.org.text;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JPanel;


public class Drawer extends JPanel{
	private LinkedList<HashMap<String,Integer>>line;   //9/6  一條線
	public Drawer(){
		MyListener listener = new MyListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
		line = new LinkedList<>();
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.red);
		g2d.setStroke(new BasicStroke(4));
		//g2d.drawLine(0, 0, 100, 100);
		//9/6
		for(int i=1 ; i<line.size(); i++){
			HashMap<String,Integer> p0 = line.get(i-1);
			HashMap<String,Integer> p1 = line.get(i);
			Integer p0x = p0.get("x"), p0y = p0.get("y");
			Integer p1x = p1.get("x"), p1y = p1.get("y");
			g2d.drawLine(p0x,p0y,p1x,p1y);
		}
	}
	private class MyListener extends MouseAdapter {

		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			int x = e.getX(), y = e.getY();
			//測試
			//System.out.println("Dragged:"+ x + "x" + y);
			//9/6
			HashMap<String,Integer>point = new HashMap<>();
			point.put("x",x);point.put("y",y);
			line.add(point);
			
			repaint(); //執行
		}

		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			int x = e.getX(), y = e.getY();
			//測試
			//System.out.println("Pressed:"+ x + "x" + y);
			//9/6
			//這是因為滑鼠點一下會產生點所以這樣寫
			HashMap<String,Integer>point = new HashMap<>();
			point.put("x",x);point.put("y",y);
			line.add(point);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			super.mouseReleased(e);
			int x = e.getX(), y = e.getY();
			//測試
			//System.out.println("Released:"+ x + "x" + y);
		}
		
	}
	
}
