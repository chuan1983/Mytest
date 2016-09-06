package tw.org.text;


import java.awt.BorderLayout;

import javax.swing.JFrame;


public class MyPainter extends JFrame{          //視窗Drower 引用JFrame的功能
	private Drawer drawer;
	public MyPainter(){
		super("My Painter");
	
		setLayout(new BorderLayout());
		
		drawer = new Drawer();                //放在中間
		add(drawer, BorderLayout.CENTER);
		
		setSize(1024, 768);                        //視窗大小
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		System.out.println();
	}

}
