package ch14;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.sql.Date;

public class FileWriterEx2 extends MFrame 
implements ActionListener {

	TextArea ta;
	TextField tf;
	Button save;
	
	public FileWriterEx2() {
		super(300, 400);
		setTitle("FileWriterEx1");
		add(ta=new TextArea());
		Panel p = new Panel();
		p.add(tf = new TextField(25));
		p.add(save = new Button("SAVE"));
		ta.setEditable(false);
		tf.addActionListener(this);
		save.addActionListener(this);
		add(p,BorderLayout.SOUTH);
		validate();
	}
	
	@Override //for�� Thread.sleep(1000) -> 1��
	public void actionPerformed(ActionEvent e) {
		try {
			ta.append(tf.getText() + "\n");
			tf.setText("");
			tf.requestFocus();
			FileWriter fw = new FileWriter("ch14/" + System.currentTimeMillis() + ".txt");
			if(e.getSource() == save) {
				fw.write(ta.getText());
				//saveFile(ta.getText());
				for(int i = 5; i>0; i--) {
					ta.setText("�����Ͽ����ϴ�. " + i + "�� �Ŀ� ������ϴ�.");
					Thread.sleep(1000);
				}
				ta.setText("");
			}
			fw.flush();
			fw.close();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
	}
	
//	public void saveFile(String str) {
//		try {
//			long fName = System.currentTimeMillis();
//			FileWriter fw = new FileWriter("ch14/"+fName+".txt");
//			fw.write(str);
//			fw.flush();
//			fw.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	public static void main(String[] args) {
		new FileWriterEx2();	
	}
}







