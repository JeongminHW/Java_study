package ch08;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame2 extends MFrame{
	Button btn;
	
	public MyFrame2() {
		btn = new Button("Button");
		setBackground(MColor.rColor());
		add(btn, BorderLayout.SOUTH);
		// 익명클래스 문법으로 인터페이스를 사용하는 방법
		// 매개변수에 ActionListener 타입의 객체가 들어가야함
		// 익명클래스 : 선언과 동시에 객체를 생성
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setBackground(MColor.rColor());
			}
		});
	}
	public static void main(String[] args) {
		new MyFrame2();
	}

}
