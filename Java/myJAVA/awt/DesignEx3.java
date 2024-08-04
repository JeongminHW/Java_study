package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.List;
import java.awt.Panel;
import java.awt.TextField;

public class DesignEx3 extends MFrame2{

	List list;
	Button b[] = new Button[4];
	String lab[] = {"추가","지우기","전체지우기","종료"};
	TextField tf;
	String food[] ={"짜장면","짬뽕","우동"};
	
	public DesignEx3() {
		super(300,200);
		setTitle("3");
		Panel p1 = new Panel(new GridLayout(4,1));
		Panel p2 = new Panel();
		list = new List(3, false);
		for(int i = 0; i<food.length; i++) {
			list.add(food[i]);
		}
		
		for(int i = 0; i<b.length; i++) {
			b[i] = new Button(lab[i]);
			p1.add(b[i]);
		}
		
		list.select(2); //리스트 포커스
		
		tf = new TextField();
		
		add(list);
		add(p1, BorderLayout.EAST);
		add(tf, BorderLayout.SOUTH);
		tf.requestFocus();
		validate();
	}

	public static void main(String[] args) {
		new DesignEx3();
	}
}