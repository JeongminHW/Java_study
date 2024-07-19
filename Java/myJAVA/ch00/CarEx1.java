package ch00;

// 객체, 클래스
// 속성(변수), 기능(메소드)

// 클래스 : 객체를 만드는 틀
// 객체의 속성과 기능이 포함되어있음
// 속성 : 객체가 가지고있어야 하는 값
class Car1{
	// 변수(필드) : 객체의 속성, 괄호가 없음
	String carName;
	int velocity;
	String carColor;
	
	// 메소드 : 객체의 기능, 괄호가 필요함
	void speedUp() {
		velocity++;
	}
	void speedDown() {
		velocity--;
		if(velocity<0)
			velocity = 0;
	}
	void stop() {
		velocity = 0;
	}
}

public class CarEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("hello~~");
		int len = s.length();
		// 현재 문자열의 길이를 리턴
		System.out.println(len);
		/*
		 * prn("개잠옴");
		 * 
		 * int a = Math.abs(-10); 
		 * System.out.println(a);
		 */
		
		Car1 c1 = new Car1();
		c1.carName = "제네시스";
		c1.carColor = "무광 그레이";
		c1.speedUp();
		System.out.println("차종 : " + c1.carName + "\t색상 : " + c1.carColor + "\t속도 : " + c1.velocity);
		
		Car1 c2 = new Car1();
		c2.carName = "카니발";
		c2.carColor = "화이트";
		c2.velocity = 100;
		System.out.println("차종 : " + c2.carName + "\t색상 : " + c2.carColor + "\t속도 : " + c2.velocity);
		
		System.out.println(c1); //클래스명 + 객체명 + 메모리 주소값(16진수) 출력
		System.out.println(c2);
	}
	
	public static void prn(String s) {
		System.out.println("출력 : " + s);
	}
}
