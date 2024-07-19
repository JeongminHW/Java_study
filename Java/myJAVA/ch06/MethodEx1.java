package ch06;

class Method1 {
	// 메소드 : 객체의 반복적인 기능을 최대한 세분화 시켜야함
	// 리턴타입 메소드명 (매개변수) {선언부}
	int abs(int num) {
		if (num < 0)
			num = -num;
		return num;
	}
	
	void prn(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
}

public class MethodEx1 {

	public static void main(String[] args) {
		Method1 m1 = new Method1();
		System.out.println(m1.abs(2));
		m1.prn(4, 5);
	}

}
