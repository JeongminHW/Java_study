package awt;

import java.awt.*;

import javax.swing.border.Border;

public class DesignEx1 extends MFrame2 {
	
	Label label;
	Checkbox cb1, cb2, cb3;
	CheckboxGroup cbg;
	Button btn1, btn2;
	
	public DesignEx1() {
		super(250, 150);
		setTitle("1");
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		label = new Label("과일중에 선택", Label.CENTER);
		label.setBackground(MColor.rColor());
		
		cbg = new CheckboxGroup();
		p1.add(cb1 = new Checkbox("사과", cbg, false));
		p1.add(cb2 = new Checkbox("딸기", cbg, true));
		p1.add(cb3 = new Checkbox("앵두", cbg, false));
		
		p2.add(btn1 = new Button("Start"), BorderLayout.SOUTH);
		p2.add(btn2 = new Button("End"), BorderLayout.SOUTH);
		
		add(label, BorderLayout.NORTH);
		add(p1);
		add(p2, BorderLayout.SOUTH);
		setResizable(true);
		validate();
	}	

	public static void main(String[] args) {
		new DesignEx1();
	}

}

