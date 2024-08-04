package awt;
import java.awt.event.*;

import javax.swing.JOptionPane;

import java.awt.*;

public class DialogEx1 extends MFrame implements ActionListener{
	Button btn;
	String title = "메세지 대화상자";
	
	public DialogEx1() {
		super(300, 300);
		setTitle("Dialog 예제");
		setLayout(new BorderLayout());
		add(btn = new Button("보이기"), BorderLayout.SOUTH);
		btn.addActionListener(this);
		setResizable(true);
		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		/*JOptionPane.showMessageDialog(btn, "메시지");*/
		MyDialog md = new MyDialog(this, title, true);
		md.setSize(150, 100);
		md.setLocationRelativeTo(this); //창이 유동적일 때 서브 프레임이 중앙에 뜨게 함
		md.setVisible(true);
	}
	
	//내부 클래스
	class MyDialog extends Dialog implements ActionListener{ //디폴트를 상속하지 않았기 때문에 오류 발생
		Button b;
		
		public MyDialog(Frame owner, String title, boolean modal) {
			super(owner, title, modal);
			setLayout(new FlowLayout());
			b = new Button("확인");
			b.addActionListener(this);
			add(b);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			dispose(); // 다이얼로그 컨테이너가 사라짐
		}
		
	}

	public static void main(String[] args) {
		new DialogEx1();
	}

}
