package awt;
import java.awt.*;
import java.awt.event.*;

public class ChoiceEx2 extends MFrame implements ItemListener{
	Choice air, city;
	String sair[] = {"대한항공","아시아나","에어부산","진에어"};
	String scity[] = {"서 울","대 전","대 구","부 산","제주도"};
	public ChoiceEx2() {
		super(300, 300, new Color(100, 200, 100));
		setTitle("Choice 예제2");
		air = new Choice();
		for(int i = 0; i <sair.length;i++) {
			air.add(sair[i]);
		}
		city = new Choice();
		for(int i = 0; i <scity.length;i++) {
			city.add(scity[i]);
		}
		//air와 city의 아이템을 변경하면 itemStateChanged 호출
		air.addItemListener(this);
		city.addItemListener(this);
		add(air);
		add(city);
		add(new Label("항공사와 도시를 선택하세요."));
		validate();
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		repaint(); //페인트 호출
	}
	
	@Override
	//생성자 호출 후에 자동적으로 호출되는 메소드 
	public void paint(Graphics g) { //g : 붓의 역할을 하는 객체
		super.paint(g); //기본 그리기 수행
		if(air == null || city == null) 
			return;
		g.setColor(Color.BLUE);
		String str = "항공사 선택 : " + air.getSelectedItem();
		g.drawString(str, 30, 120);
		
		g.setColor(Color.red);
		str = "도시 선택 : " + city.getSelectedItem();
		g.drawString(str, 30, 150);
	}

	public static void main(String[] args) {
		new ChoiceEx2();
	}

}
