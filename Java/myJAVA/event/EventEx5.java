package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EventEx5 extends MFrame implements ItemListener {

	Checkbox red, green, cyan;
	CheckboxGroup grp;
	Panel p;
	public EventEx5() {

		p = new Panel();
		grp = new CheckboxGroup();
		p.add(red = new Checkbox("Red", false, grp));
		p.add(green = new Checkbox("Green", false, grp));
		p.add(cyan = new Checkbox("Cyan", true, grp));
		red.addItemListener(this);
		green.addItemListener(this);
		cyan.addItemListener(this);
		setBackground(Color.cyan);
		add(p, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		new EventEx5();
	}


	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource() == red) {
			setBackground(Color.RED);
		}else if(e.getSource() == green) {
			setBackground(Color.GREEN);
		}else {
			setBackground(Color.cyan);
		}
	}

}