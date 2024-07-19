package ch06;

import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MFrame {

	public static void main(String[] args) {
		MyFrame2 m = new MyFrame2();
		Button btn = new Button();
		m.add(btn, "South");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				m.setBackground(randomColor());
			}
		});
		
		MyFrame2 m2 = new MyFrame2(400, 400, Color.orange, false); 
	}
	
	public static Color randomColor() {
		Random rd = new Random();  
		int r = rd.nextInt(256);//0~255 랜덤정수
		int g = rd.nextInt(256);//0~255 랜덤정수
		int b = rd.nextInt(256);//0~255 랜덤정수
		return new Color(r,g,b);
	}

}
