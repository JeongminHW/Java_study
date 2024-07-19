package ch06;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ThisFrame extends MFrame3 implements ActionListener { // 인터페이스 : 강제적으로 메소드 구현
	Button btn = new Button("my Button");

	public ThisFrame() {
		add(btn, "South");
		//매개변수가 ActionListener 타입 객체
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(MColor.rColor());
	}
}

public class ThisEx2 {

	public static void main(String[] args) {
		new ThisFrame();
		
	}

}
