package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class RunnableFrameEx3 extends MFrame implements Runnable{

	Random r = new Random();
	int x, y;
	Color c;
	
	public RunnableFrameEx3(int x1, int y1) {
		super(200, 200);
		c = MColor.rColor();
		setLocation(x1, y1);
	}
	
	public void run() {
		try {
			for(int i = 0; i<20; i++) {
				x = r.nextInt(200);
				y = r.nextInt(200);
				Thread.sleep(500);
				repaint();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Graphics g) {
		g.clipRect(x, y, 10, 10);
		paint(g);
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(c);
		g.fillOval(x, y, 10, 10);
	}

	
	public static void main(String[] args) {
		RunnableFrameEx3 ra[] = new RunnableFrameEx3[9];
		for(int i = 0; i<ra.length;i++) {
			int x1 = 200 + (200*(Math.floorMod(i, 3)));
			int y1 = 200 + (200*(Math.floorDiv(i, 3)));
			ra[i] = new RunnableFrameEx3(x1, y1);
			new Thread(ra[i]).start();
		}
	}
}