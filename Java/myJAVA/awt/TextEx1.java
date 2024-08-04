package awt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class TextEx1 extends MFrame implements ActionListener{
	TextField tf1, tf2;
	TextArea ta;
	
	public TextEx1() {
		super(250, 300);
		add(new Label("성명"));
		add(tf1 = new TextField(("홍길동"), 20));
		add(new Label("암호"));
		add(tf2 = new TextField((""), 20));
		tf2.setEchoChar('@');
		tf2.addActionListener(this);
		//ta.setEditable(false);
		add(ta = new TextArea(10, 30));
		ta.setEnabled(false); //더강력함
		ta.append("Text 예제");
		Color c[] = MColor.rColor2();
		ta.setBackground(c[0]);
		ta.setBackground(c[1]);
		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = tf1.getText() + "/" + tf2.getText() + "\n";
		ta.append(str);
		tf1.setText("");
		tf2.setText("");
		tf1.requestFocus();
	}
	
	public static void main(String[] args) {
		new TextEx1();
	}

}
