package ch06;

import java.awt.*;


// jdk에서 지원되는 클래스의 메소드 중에 protected 사용하는 방법


class MyFrame1 extends Frame{
	public MyFrame1() {
		setSize(200, 200);
		setLocation(100,100);
		setVisible(true);
	}
	
	public void prn() {
		//유일한 방법
		System.out.println(paramString());
	}
}

public class AccessEx3 {

	public static void main(String[] args) {
		MyFrame1 mf = new MyFrame1();
		mf.prn();
	}

}
