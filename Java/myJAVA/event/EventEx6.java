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

public class EventEx6 extends MFrame{

	Checkbox red, green, cyan;
	CheckboxGroup grp;
	Panel p;
	public EventEx6() {

		p = new Panel();
		grp = new CheckboxGroup();
		p.add(red = new Checkbox("Red", false, grp));
		p.add(green = new Checkbox("Green", false, grp));
		p.add(cyan = new Checkbox("Cyan", true, grp));
		
		setBackground(Color.cyan);
		add(p, BorderLayout.SOUTH);
red.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				setBackground(Color.RED);
			}
		});
		green.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				setBackground(Color.GREEN);
			}
		});
		cyan.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				setBackground(Color.cyan);
			}
		});
	}

	public static void main(String[] args) {
		new EventEx6();
	}


}