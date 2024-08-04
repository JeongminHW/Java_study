package event;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyAction implements ActionListener{
	EventEx2 f;
	
	public MyAction(EventEx2 f) {
		this.f = f;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼을 클릭하면 프레임의 배경색, 버튼의 배경색 랜덤 변경
		f.btn.setBackground(MColor.rColor());
		f.setBackground(MColor.rColor());
	}
	
}

public class EventEx2 extends MFrame implements ActionListener{
	Button btn;
	
	public EventEx2() {
		add(btn = new Button("버튼2"), BorderLayout.SOUTH);
		btn.addActionListener(this);
		//이벤트 리스너 객체 생성
		MyAction ma = new MyAction(this);
		btn.addActionListener(ma);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(MColor.rColor());
	}

	public static void main(String[] args) {
		new EventEx2();
	}
}
