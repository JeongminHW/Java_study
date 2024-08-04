package awt;
import java.awt.*;

public class LabelEx1 extends MFrame{
	Label lb[] = new Label[4]; //Label 객체가 만들어진 것이 아니고 배열 객체가 만들어진 것
	int pos[] = {Label.LEFT, Label.RIGHT, Label.CENTER, Label.LEFT};
	
	public LabelEx1() {
		super(200, 200);
		String str = "오늘은 행복한 월..요일?";
		for(int i = 0; i < lb.length; i++) {
			lb[i] = new Label(str, pos[i]);
			lb[i].setBackground(MColor.rColor());
			//컴포넌트 생성 후 세팅 -> 컨테이너에 부착(add)
			add(lb[i]);
		}
		setResizable(true);
		validate(); //새로고침
	}

	public static void main(String[] args) {
		new LabelEx1();
	}

}
