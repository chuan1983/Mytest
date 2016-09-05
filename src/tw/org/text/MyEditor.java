package tw.org.text;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import javafx.stage.FileChooser;
import jdk.jfr.events.FileWriteEvent;

public class MyEditor extends JFrame{
	private JButton open,save,exit; //第2步
	private JTextArea editor;   //第3步
	private File openFile;      //第6步

	public MyEditor(){
		super("My Editor");                         //建立視窗
		setLayout(new BorderLayout());              //建立視窗
		//2
		open = new JButton("Open");                  //按鈕
		save = new JButton("Save");
		exit = new JButton("Exit");
		JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));   //按鈕移到左邊
		top.add(open);top.add(save);top.add(exit);
		add(top, BorderLayout.NORTH);
		
		//3
		editor = new JTextArea();                        //文字編輯器
		JScrollPane jsp = new JScrollPane(editor);       //這是讓視窗有卷軸空能
		add(jsp, BorderLayout.CENTER);                   //editor換jsp
		
		setSize(800, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//4
		open.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				doOpen();
			}
		});
		save.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				doSave();
			}
		});
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}	
		});
	}
	//4
	private void doOpen(){
		//5
		JFileChooser jfc = new JFileChooser();
		//這裡的null是對可以對應的,這邊是確認點選的文件路徑是否正確
		if(jfc.showOpenDialog(null)== 
				JFileChooser.APPROVE_OPTION){
			//6 把openFile改成物件導向
			openFile = jfc.getSelectedFile();       //這邊開啟  
			//System.out.println(openFile.getAbsolutePath());
			//7
			readFile();    //這邊讀取
		}
	}
	//7  讀取文字
	private void readFile(){           
		if (openFile == null) return;
		editor.setText("");
		try {
			FileReader reader = new FileReader(openFile);
			int c;
			while ( (c = reader.read()) != -1){
				editor.append("" + (char)c);
			}
			reader.close();
		} catch (Exception e) {
		}
		
	}
	//4  改寫之後能夠存取
	private void doSave(){
		if (openFile == null) return;
		try {
			FileWriter writer = new FileWriter(openFile);
			writer.write(editor.getText());
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new  MyEditor();
	}

}
