package ch06;

class Method2 {
	
	Method2() {
		
	}
	
	//메소드 오버로딩 : 동일한 클래스 내에 동일한 메소드 명으로 매개변수의 개우와 타입을 달리해서 선언하고 같은 기능을 함
	void prn(int a) {
		System.out.println(a);
		return; // 리턴값이 없어도 선언 가능
	}

	// 메소드 오버로딩의 조건 : 매개변수의 개수와 타입이 달라야함
	void prn(int a, int b) {
		System.out.println(a + "\t" + b);
	}

	void prn(int a, int b, int c) {
		System.out.println(a + "\t" + b + "\t" + c);
		System.out.println();
	}
	
	// printf : 가변 인수
	void prnf(int...arr) { // ...arr : 자동 배열
		for (int i = 0; i < arr.length; i++) {
			System.out.printf(arr[i]+"\t");
		}
		System.out.println();
	}
}

public class MethodEx2 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(true);
		System.out.println("하하");
		System.out.println(3.14);
		
		Method2 m2 = new Method2();
		
		m2.prn(3);
		m2.prn(1, 10);
		m2.prn(1, 10 ,100);
		
		m2.prnf(1);
		m2.prnf(1,2);
		m2.prnf(1,2,3);
		m2.prnf(1,2,3,4);
		m2.prnf(1,2,3,4,5);
		
		//모든 자바 기본형 타입은 Wrapper 클래스 타입으로 자동변환
		System.out.printf("%s vs %d vs %f", "문자열", 22, 3.14);
	}

}
