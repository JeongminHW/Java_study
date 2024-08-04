package awt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

import javax.swing.border.Border;

public class TextEx2 extends MFrame implements ActionListener{
	TextArea ta;
	TextField tf;
	Button btn;
	
	public TextEx2() {
		super(260, 300);
		setTitle("채팅 버전1.0");
		setLayout(new BorderLayout());
		add(ta = new TextArea());
		ta.setEditable(false);
		Color c[] = MColor.rColor2();
		ta.setBackground(c[0]);
		ta.setForeground(c[1]);
		//그룹 컨테이너(텍스트 필드 + 버튼)
		Panel p = new Panel();
		p.add(tf = new TextField(22));
		p.add(btn = new Button("SEND"));
		
		tf.addActionListener(this);
		btn.addActionListener(this);
		add(p, BorderLayout.SOUTH);
		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = tf.getText().trim();
		if(str.length()==0) {
			str = "입력 하세요";
			ta.append(str + "\n");
			tf.setText("");
			tf.requestFocus();
		}
		else {
			ta.append(str + "\n");
			tf.setText("");
			tf.requestFocus();
		}
		
	}
	
	public static void main(String[] args) {
		new TextEx2();
	}

}
