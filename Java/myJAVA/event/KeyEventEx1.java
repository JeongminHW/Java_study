package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

//텍스트 필드에 키 이벤트 추가
public class KeyEventEx1 extends MFrame implements ActionListener, KeyListener{

	TextField tf;
	TextArea ta;
	Button btn;

	public KeyEventEx1() {
		super(300, 500);
		add(tf = new TextField(), BorderLayout.SOUTH);
		add(ta = new TextArea());
		ta.setEditable(false);
		btn = new Button("REMOVE");
		btn.addActionListener(this);
		tf.addKeyListener(this);
		add(btn, BorderLayout.NORTH);
		validate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ta.setText("");
		tf.setText("");
		tf.requestFocus();
	}
	
	@Override
	public void keyTyped(KeyEvent e) { //문자 인식 후 변환될 때 타입
		ta.append("##keyPressed : " + tf.getText() + "\n");
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}


	public static void main(String[] args) {
		new KeyEventEx1();
	}
}