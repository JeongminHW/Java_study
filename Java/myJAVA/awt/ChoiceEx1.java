package awt;
import java.awt.*;

public class ChoiceEx1 extends MFrame {
	Choice ch;
	String city[] = {"도시를 선택하세요.","베를린","파 리", "하와이","런 던","평 양","뉴 욕"};
	public ChoiceEx1() {
		super(300, 300, new Color(100, 200, 100));
		setTitle("Choice 예제1");
		ch = new Choice();
		for(int i =0; i<city.length;i++) {
			ch.add(city[i]);
		}
		add(ch);
		validate();
	}

	public static void main(String[] args) {
		new ChoiceEx1();
	}

}
