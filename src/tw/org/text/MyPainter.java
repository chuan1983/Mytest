package tw.org.text;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class MyPainter extends JFrame{          //視窗Drower 引用JFrame的功能
		
	private Drawer drawer;
	private JButton clear, undo, redo,save;
	private MyClock clock;
	
	public MyPainter(){
		super("My Painter");
		setLayout(new BorderLayout());
		//9/6
		clear = new JButton("clear");
		undo = new JButton("undo");
		redo = new JButton("redo");
		save = new JButton("save");
		clock = new MyClock();
		JPanel top = new JPanel(new BorderLayout());
		JPanel topLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel topRight = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		top.add(topLeft, BorderLayout.WEST);
		top.add(topRight, BorderLayout.EAST);
		topLeft.add(clear);
		topLeft.add(undo);
		topLeft.add(redo);
		topLeft.add(save);
		topRight.add(clock);
		add(top,BorderLayout.NORTH);        //北邊
		
		drawer = new Drawer();                //放在中間
		add(drawer, BorderLayout.CENTER);
		
		setSize(1024, 768);                        //視窗大小
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		clear.addActionListener(new ActionListener() {		    //呼叫清除功能	
			@Override
			public void actionPerformed(ActionEvent e) {
				clearDrawer();
			}
		});
		undo.addActionListener(new ActionListener() {		    //呼叫回上一步功能	
			@Override
			public void actionPerformed(ActionEvent e) {
				undoDrawer();
			}
		});
		redo.addActionListener(new ActionListener() {		    //呼叫回下一步清除功能	
			@Override
			public void actionPerformed(ActionEvent e) {
				redoDrawer();
			}
		});
		save.addActionListener(new ActionListener() {		    //存檔	
			@Override
			public void actionPerformed(ActionEvent e) {
				saveDrawer();
				//save2Drawer();
			}
		});
	}
	
	private void clearDrawer(){               //清除功能
		drawer.clear();
	}
	private void undoDrawer(){               //清除功能
		drawer.undo();
	}
	private void redoDrawer(){               //清除功能
		drawer.redo();
	}
	private void saveDrawer(){               //存檔
		BufferedImage img = new BufferedImage(drawer.getWidth(), drawer.getHeight(), BufferedImage.TYPE_INT_RGB);
		drawer.print(img.getGraphics()); // or: panel.printAll(...);
		try {
			ImageIO.write(img, "jpg", new File("dir1/drawer.jpg"));
			System.out.println("Save OK");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
	private void save2Drawer(){               //清除功能
		BufferedImage bi = 
				new BufferedImage(drawer.getWidth(), drawer.getHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics g = bi.createGraphics();
		drawer.paint(g); // this == JComponent
		g.dispose();
		try {
			ImageIO.write(bi, "png", new File("dir1/test.png"));
			System.out.println("Save2 OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static void main(String[] args) {
		System.out.println();
	}

}
