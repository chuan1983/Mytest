package tw.org.text;

import javax.swing.JButton;
import javax.swing.JFrame;
//Chuan28延續JFrame的物件
public class Chuan30繼承視窗製作 extends JFrame{
	private JButton open,save,exit; 
	public Chuan30繼承視窗製作(){
		super("My Window App");
		open = new JButton("open");
		save = new JButton("save");
		exit = new JButton("exit");
		//JFrame延window的物件
		setSize(640, 480);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Chuan30繼承視窗製作();
	}

}