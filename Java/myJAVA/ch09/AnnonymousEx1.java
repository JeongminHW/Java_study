package ch09;

// 익명클래스는 추상클래스와 인터페이스를 사용하기 위한 목적으로 제공

abstract class MyAbst1{
	abstract void prn1();
}

interface MyInter1{
	void prn2();
}

class A extends MyAbst1{
	@Override
	void prn1() {
		System.out.println("prn1");
	}
}

class B implements MyInter1{
	@Override
	public void prn2() {
		System.out.println("prn2");
	}
}

public class AnnonymousEx1 {

	public static void main(String[] args) {
		A a = new A();
		a.prn1();
		B b = new B();
		b.prn2();
		
		new MyAbst1() /*타입선언*/ /*구현시작*/ { // 추상클래스로 실제 객체 생성 불가능
			
			@Override
			void prn1() {
				System.out.println("익명클래스 구현1");
			}
		}.prn1();
		
		new MyInter1() {
			
			@Override
			public void prn2() {
				System.out.println("익명클래스 구현2");
			}
		}.prn2();
	}

}
