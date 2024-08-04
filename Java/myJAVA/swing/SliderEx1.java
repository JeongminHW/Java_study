package swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;

public class SliderEx1 extends JFrame{
	final static int INT_VALUE = 15;
	JButton btn;
	JSlider slider;
	
	public SliderEx1() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 화면이 사라짐 (Dispose_on_close)
		
		JPanel p = new JPanel();
		JLabel label = new JLabel("슬라이더를 움직여보세요", JLabel.CENTER);
		p.add(label);
		
		slider = new JSlider(0, 30, INT_VALUE);
		slider.setMajorTickSpacing(10); //큰 눈금 간격
		slider.setMinorTickSpacing(1); //작은 눈금 간격
		slider.setPaintTicks(true); //눈금 표시
		slider.setPaintLabels(true); // 라벨 표시
		p.add(slider);
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				if(slider.getValueIsAdjusting()) {
					int value = slider.getValue();
					btn.setSize(value*10, value*10);
				}
			}
		});
		
		btn = new JButton("DITA");
		ImageIcon dog = new ImageIcon("swing/dog.gif");
		btn.setIcon(dog);
		btn.setSize(INT_VALUE*10, INT_VALUE*10);
		p.add(btn);
		
		add(p);
		setVisible(true);
	}

	public static void main(String[] args) {
		new SliderEx1();
	}

}
