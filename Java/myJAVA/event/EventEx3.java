package event;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx3 extends MFrame implements ActionListener{
	Button btn;
	
	public EventEx3() {
		add(btn = new Button("버튼2"), BorderLayout.SOUTH);
		btn.addActionListener(this);
		//이벤트 리스너 객체 생성
		MyAction ma = new MyAction();
		btn.addActionListener(ma);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(MColor.rColor());
	}

	class MyAction implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// 버튼을 클릭하면 프레임의 배경색, 버튼의 배경색 랜덤 변경
			btn.setBackground(MColor.rColor());
			setBackground(MColor.rColor());
		}
		
	}
	
	public static void main(String[] args) {
		new EventEx3();
	}
}
