//도메인 뒤로 선언 : naver.com -> package : com.naver.String
package ch06;

//클래스 선언
//클래스 : 객체를 만드는 틀
class Car1 {
	// 필드 : 객체의 속성, 무조건 괄호가 없음, 소문자로 시작하고 카멜표기법 사용
	String carName;
	int velocity;
	String carColor;

	// 메소드: 객체의 기능(동작), 무조건 괄호 존재, 소문자 시작, 카멜표기법 사용
	void speedUp() {
		velocity++; // 필드 호출 가능
	}

	void speedDown() {
		velocity--;
		if (velocity < 0)
			velocity = 0;
	}

	void stop() {
		velocity = 0;
	}
}

public class CarEx1 {

	public static void main(String[] args) {
		//클래스를 가지고 객체 생성
		Car1 c1 = new Car1(); // 객체를 가르키는 변수 = 레퍼런스 변수
		c1.carName = "소나타";
		c1.carColor = "은색";
		c1.speedUp();
		System.out.println(c1.carName);
		System.out.println(c1.carColor);
		System.out.println(c1.velocity);
	}

}
