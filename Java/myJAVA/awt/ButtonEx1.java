package awt;
import java.awt.*;
import java.util.Iterator;

public class ButtonEx1 extends MFrame{
	Button btn[] = new Button[4];
	String label[] = {"추가", "삭제", "전체삭제", "종료"};
	
	public ButtonEx1() {
		super(250, 250);
		setTitle("Button 예제");
		for(int i = 0; i < btn.length; i++) {
			btn[i] = new Button(label[i]);
			Color c[] = MColor.rColor2();
			btn[i].setBackground(c[0]);
			btn[i].setBackground(c[1]);
			add(btn[i]);
		}
		validate();
	}

	public static void main(String[] args) {
		new ButtonEx1();
	}

}
