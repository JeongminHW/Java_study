package graphics;

import java.awt.*;

public class ImageViewEx1 extends MFrame{
	Image img;
	
	public ImageViewEx1() {
		super(550, 400);
		//�޸� �ε�
		img = Toolkit.getDefaultToolkit().getImage("aaa.jpg");
	}

	//�����̳� ��ü�� �����ǰ� �ʿ��� ���ҽ�(������Ʈ, �̹���)�� �׸��� �޼ҵ�� �ݺ�ȣ�� ��
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, this);
	}
	
	public static void main(String[] args) {
		new ImageViewEx1();
	}

}
