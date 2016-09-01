package tw.org.text;

import javax.swing.JButton;
import javax.swing.JFrame;
//Chuan28延續JFrame的物件
public class Chuan28 extends JFrame{
	private JButton open,save,exit; 
	public Chuan28(){
		super("My Window App");
		open = new JButton("open");
		save = new JButton("save");
		exit = new JButton("exit");
		//JFrame延window的物件
		setSize(640, 480);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Chuan28();
	}

}
