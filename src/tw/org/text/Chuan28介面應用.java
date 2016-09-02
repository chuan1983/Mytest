package tw.org.text;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//Chuan28延續JFrame的物件
public class Chuan28介面應用 extends JFrame implements ActionListener{  //9/22對JFrame 增加implements ActionListener讓OPEN有作用void actionPerformed(ActionEvent e)
	private JButton open,save,exit; 
	public Chuan28介面應用(){
		super("My Window App");
		
		setLayout(new FlowLayout());//9/2加上
		
		open = new JButton("open");
		save = new JButton("save");
		exit = new JButton("exit");
		
		add(open); add(save); add(exit);//9/2
		open.addActionListener(this);//9/2呼叫OPEN
		open.addActionListener(new MyListener());  //賦予OPEN多種觸發
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Chuan");
				
			}
		});
		save.addActionListener(this);//註解下列
		exit.addActionListener(this);
		
//		save.addActionListener(new MyListener());
//		exit.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.exit(0);
//				
//			}
//		});
		//JFrame延window的物件
		setSize(640, 480);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);//9/2
	}

	public static void main(String[] args) {
		new Chuan28介面應用();
	}

	@Override
	public void actionPerformed(ActionEvent e) {  //9/2OPEN的作用
		if(e.getSource() == open){
			System.out.println("open");
		}else if(e.getSource() == save){
			System.out.println("save");
		}else if(e.getSource() == exit)
			System.out.println("exit");
	}
	class MyListener implements ActionListener{  //自己作用一個EXIT物件

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("save");
			
		}
		
	}

}
