package ch09;

/* 중첩(내부)클래스
 * 1. 클래스 안에 선언(활용 100%)
 * 2. 클래스 안에 선언하지만 static 클래스 선언(활용 1%)
 * 3. 메소드 안에 클래스 선언(활용 10%)
 * 4. 메소드 안에 선언하고 동시에 익명클래스 사용 (활용 100%)
 * PS: 메소드 안에 메소드 선언은 불가능 -> JSP
 * */

interface MyInter{
	void prn();
}

class Outer1{
	//1. 클래스 안에 선언
	class Inner1{}
	
	//2. 클래스 안에 선언하지만 static 클래스로 선언
	static class Inner2{}
	
	void method() {
		//3. 메소드 안에 클래스 선언
		class Inner3{}
		//4. 메소드 안에 익명클래스 선언
		new MyInter() {
			
			@Override
			public void prn() {
			}
		};
	}
}

public class InnerEx1 {

	public static void main(String[] args) {

	}

}
