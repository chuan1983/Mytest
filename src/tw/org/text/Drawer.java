package tw.org.text;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import tw.org.text.Chuan28介面應用.MyListener;


public class Drawer extends JPanel{
	public Drawer(){
		MyListener listener = new MyListener();
		addMouseListener(listener);
		addMouseMotionListener(listener);
	}
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.setColor(Color.red);
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(0, 0, 100, 100);
	}
	private class MyListener extends MouseAdapter {

		@Override
		public void mouseDragged(MouseEvent e) {
			super.mouseDragged(e);
			int x = e.getX(), y = e.getY();
			System.out.println("Dragged:"+ x + "x" + y);
		}

		@Override
		public void mousePressed(MouseEvent e) {
			super.mousePressed(e);
			int x = e.getX(), y = e.getY();
			System.out.println("Pressed:"+ x + "x" + y);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			super.mouseReleased(e);
			int x = e.getX(), y = e.getY();
			System.out.println("Released:"+ x + "x" + y);
		}
		
	}
	
}
