package ch06;

import java.awt.Frame;

class Super3 extends Object{ //2대 클래스
	Super3(){ 
		super(); // 생략되어 있음 (반드시 생성자의 첫번째 라인에 존재 -> 내 객체가 만들어지기 전에 부모클래스 객체가 먼저 만들어져야함)
		//Object (슈퍼 클래스) <-> Super3(서브클래스)
		System.out.println("Super3 생성자");
		
	}
}


class Sub3 extends Super3{ //3대 클래스
	public Sub3() {
		super(); //Super3의 디폴트 생성자
		System.out.println("Sub3 생성자");
	}
}


public class ConstructorEx3 {

	public static void main(String[] args) {
		//Super3 s1 = new Super3();
		Sub3 s3 = new Sub3();
		Frame f = new Frame();
	}

}
