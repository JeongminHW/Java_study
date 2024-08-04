package ch08;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends MFrame implements ActionListener { // 인터페이스는 추상메소드를 가지고있음, 추상클래스는 추상메소드가 없어도됨
	Button btn;

	public MyFrame() {
		btn = new Button("Button");
		setBackground(MColor.rColor());
		add(btn, BorderLayout.SOUTH);
		// MyFrame은 ActionListener 타입
		// 버튼을 클릭하면 이벤트핸들러(actionPerformed)가 호출됨
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(MColor.rColor());
	}

	public static void main(String[] args) {
		new MyFrame();
	}

}
