package tw.org.text;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyPainter extends JFrame{          //視窗Drower 引用JFrame的功能
		
	private Drawer drawer;
	private JButton clear;
	
	public MyPainter(){
		super("My Painter");
		setLayout(new BorderLayout());
		//9/6
		clear = new JButton("clear");
		JPanel top =new JPanel(new FlowLayout(FlowLayout.LEFT));     //左邊
		top.add(clear);
		add(top,BorderLayout.NORTH);        //北邊
		
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
