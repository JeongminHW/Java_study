package ch09;

class Outer2 {
	int a = 22; // 외부클래스 필드

	void prn1() {
		System.out.println(a);
		/*
		 * prn2(); // 내부클래스 메소드 직접 호출 불가능 System.out.println(b);
		 */
		// 일반적으로 내부클래스는 선언된 외부클래스 내에서 사용
		// 이유 : 내부클래스는 외부클래스와 밀접한 관계로 만들어짐
		Inner2 i2 = new Inner2();
	}

	// 외부클래스 입장에서는 내부클래스를 메소드의 형태로 인식
	// 메소드에는 없는 클래스의 많은 기능이 있음 -> 상속, 독립적인 객체
	class Inner2 {
		int b = 23;

		void prn2() {
			prn1(); // 외부클래스 메소드 호출 가능
			System.out.println(a + b); // 외부클래스 필드 사용 가능
		}
	}
}

public class InnerEx2 {

	public static void main(String[] args) {
		// 제3의 클래스에서 내부 클래스 사용 방법
		// 사용되는 경우는 거의 없음
		Outer2 out = new Outer2();
		out.prn1();
		Outer2.Inner2 in = out.new Inner2();
		in.prn2();
	}

}
