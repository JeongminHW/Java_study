package awt;
import java.awt.*;
import java.awt.event.*;

public class ChoiceEx3 extends MFrame implements ItemListener{
	Choice name, star;
	String ms[] = {"현 빈","원 빈","이민호","김수현","김우빈","이종석"};
	String fs[] = {"고아라","이연희","이하늬","문채원","수 지","김연아"};
	
	//기존 star에 있는 아이템을 제거하고 다시 추가
	public ChoiceEx3() {
		name = new Choice();
		name.add("남자연예인");
		name.add("여자연예인");
		star = new Choice();
		inputItem(star, ms);
		name.addItemListener(this);
		star.addItemListener(this);
		add(name);
		add(star);
		validate();
	}
	

	public void inputItem(Choice ch, String item[]) {
		ch.removeAll();
		for(int i = 0; i<item.length; i++) {
			ch.add(item[i]);
		}
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		String str1 = name.getSelectedItem();
		if(str1.equals("남자연예인")) {
			inputItem(star, ms);
		}
		else if(str1.equals("여자연예인")) {
			inputItem(star, fs);
		}
	}
	
	
	public static void main(String[] args) {
		new ChoiceEx3();
	}

}
