package ch06;

import java.awt.*;
import java.util.Random;

public class YouFrame3 extends MFrame3 {
	
	public YouFrame3() {
		super(500, 500);
		TextArea ta = new TextArea();
		TextField tf = new TextField();
		add(ta);
		add(tf, "South");
		Color c[] = MColor.rColor2();
		ta.setBackground(c[0]);
		ta.setForeground(c[1]); //글자색
		tf.setBackground(c[0]);
		tf.setForeground(c[1]);
		validate();
		
	}

	public static void main(String[] args) {
		new YouFrame3();
		Random r = new Random();
		/*
		 * for(int i = 0; i < 1000; i++) { MFrame3 m = new MFrame3(200, 200);
		 * m.setBackground(m.randomColor()); m.setBounds(r.nextInt(1000),
		 * r.nextInt(700), 200, 200); m.validate(); }
		 */
	}
}
