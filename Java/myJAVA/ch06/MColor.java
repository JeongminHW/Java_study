package ch06;

import java.awt.*;
import java.util.*;

public class MColor {
	// static : 객체 생성없이 클래스명으로 사용 가능
	static Random rd = new Random();

	public static Color rColor() {
		int r, g, b;
		r = rd.nextInt(256);
		g = rd.nextInt(256);
		b = rd.nextInt(256);
		return new Color(r, g, b);
	}

	public static Color[] rColor2() {
		int r, g, b;
		r = rd.nextInt(256);
		g = rd.nextInt(256);
		b = rd.nextInt(256);
		Color c[] = new Color[2];
		c[0] = new Color(r,g,b);
		c[1] = new Color(255-r, 255-g, 255-b);
		return c;
	}
}
