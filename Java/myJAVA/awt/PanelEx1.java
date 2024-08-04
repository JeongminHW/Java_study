package awt;
import java.awt.*;


public class PanelEx1 extends MFrame{
	Label label[] = new Label[3];
	Button btn[] = new Button[3];
	String str1[] = {"첫번째", "두번째", "세번째"};
	String str2[] = {"Start", "Stop", "End"};
	
	public PanelEx1() {
		setLayout(new BorderLayout());
		Panel p1 = new Panel();
		Panel p2 = new Panel();
		p1.setBackground(MColor.rColor());
		for(int i = 0; i < label.length; i++) {
			//label[i] = new Label(str1[i], Label.CENTER);
			p1.add(label[i] = new Label(str1[i], Label.CENTER));
			label[i].setBackground(MColor.rColor());
			
		}
		p2.setBackground(MColor.rColor());
		for(int i = 0; i < btn.length; i++) {
			//label[i] = new Label(str1[i], Label.CENTER);
			p2.add(btn[i] = new Button(str2[i]));
			btn[i].setBackground(MColor.rColor());
		}
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.SOUTH);
		setResizable(true);
		validate();
	}

	public static void main(String[] args) {
		new PanelEx1();
	}

}
