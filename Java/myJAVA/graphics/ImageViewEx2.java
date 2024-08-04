package graphics;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class ImageViewEx2 extends MFrame{
	Image img;
	Button btn1, btn2, btn3, btn4;
	String str[] = {"aaa0.png", "aaa1.png", "aaa2.png"};
	
	public ImageViewEx2() {
		super(550, 300);
		Panel p = new Panel(new GridLayout(4,1));
		//�޸� �ε�
		img = Toolkit.getDefaultToolkit().getImage(str[0]);
		p.add(btn1 = new Button("ù��°"));
		p.add(btn2 = new Button("�ι�°"));
		p.add(btn3 = new Button("����°"));
		p.add(btn4 = new Button("����"));
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
				img = Toolkit.getDefaultToolkit().getImage(str[0]);
				setTitle(str[0]);
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
				img = Toolkit.getDefaultToolkit().getImage(str[1]);
				setTitle(str[1]);
			}
		});
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
				img = Toolkit.getDefaultToolkit().getImage(str[2]);
				setTitle(str[2]);
			}
		});
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
				Random r = new Random();
				String rstr = str[r.nextInt(3)];
				img = Toolkit.getDefaultToolkit().getImage(rstr);
				setTitle(rstr);
			}
		});
		add(p, BorderLayout.EAST);
		validate();
	}

	//�����̳� ��ü�� �����ǰ� �ʿ��� ���ҽ�(������Ʈ, �̹���)�� �׸��� �޼ҵ�� �ݺ�ȣ�� ��
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
	
	public static void main(String[] args) {
		new ImageViewEx2();
	}

}

/*public class ImageViewEx3 extends MFrame implements ActionListener{
	Image img[] = new Image[3];
	Button btn[] = new Button[4];
	String label[] = {"ù��°", "�ι�°", "����°", "����"};
	Random r = new Random();
	int idx = 0 ;
	
	public ImageViewEx3() {
		super(550, 300);
		Panel p = new Panel();
		p.setLayout(new GridLayout(4,1));
		for(int i = 0; i< btn.length ; i++) {
			btn[i] = new Button(label[i]);
			btn[i].addActionListener(this);
			p.add(btn[i]);
		}
		for(int i = 0; i<img.length;i++) {
			img[i] = Toolkit.getDefaultToolkit().getImage("aaa" + i + ".png");
		}
		add(p, BorderLayout.EAST);
		validate();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj == btn[0]) idx = 0;
		else if(obj == btn[1]) idx = 1;
		else if(obj == btn[2]) idx = 2;
		else idx = r.nextInt(3);
		repaint(); //���������� paint() �޼ҵ� ȣ��
	}

	//�����̳� ��ü�� �����ǰ� �ʿ��� ���ҽ�(������Ʈ, �̹���)�� �׸��� �޼ҵ�� �ݺ�ȣ�� ��
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if(img == null)
			return;
		setTitle("aaa" + idx + ".png");
		g.drawImage(img[idx], 0, 0, this);
	}
	
	public static void main(String[] args) {
		new ImageViewEx3();
	}

}
*/
