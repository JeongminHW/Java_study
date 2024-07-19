package ch00;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;

public class MyFrame extends Frame {
	Button btn;
	
	// 생성자 : 객체를 만드는 메소드
	public MyFrame() {
		// TODO Auto-generated constructor stub
		setSize(300, 300);
		setBackground(randomColor());
		setVisible(true);
		btn = new Button("Click");
		add(btn, "South");
		
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setBackground(randomColor());
			}
		});
	}
	
	public Color randomColor(){
		Random rd = new Random();  
		int r = rd.nextInt(256);//0~255 랜덤정수
		int g = rd.nextInt(256);//0~255 랜덤정수
		int b = rd.nextInt(256);//0~255 랜덤정수
		return new Color(r,g,b);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
