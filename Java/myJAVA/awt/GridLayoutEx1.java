package awt;
import java.awt.*;

public class GridLayoutEx1 extends MFrame2{ //행렬 레이아웃
	public GridLayoutEx1() {
		setLayout(new GridLayout(3,2));
		add(new Button("1"));
		add(new Button("2"));
		add(new Button("Hong"));
		add(new Button("3"));
		add(new Button("4"));
		add(new Button("Gil"));
		validate();
	}

	public static void main(String[] args) {
		new GridLayoutEx1();
	}

}
