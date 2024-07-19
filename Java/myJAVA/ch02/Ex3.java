package ch02;

public class Ex3 {

	public static void main(String[] args) {
		// 데이터 타입(Data type) : 기본형 (8개) + 참조형(무한대, 클래스 타입)
		// 정수형(4)
		byte b = 10;
		short s = 10;
		int i = 20; // 기본
		long l = 30;
		
		// 실수형(2)
		float f = 3.14f; // 리터럴값 뒤에 f를 반드시 표기해줘야 함
		double d = 3.14; // 기본
		
		// 문자형(1)
		char c = 'A'; // 문자
		char c1 = '자';
		String str = "자바"; // 문자열, 참조형
		// 참조형은 대문자로 시작, 예약어는 소문자로 시작
		
		// 불린형(1)
		boolean b1 = true; // 기본값은 false
		
		// short != Short
		// int == Integer / char == Character
		System.out.println(Short.MAX_VALUE);
		short s1 = (short)32768; // 범위를 넘으면 한바퀴 돎
		System.out.println(s1);
		
		// 크기 변화에 대해 명시적 형변환 vs 묵시적 형변환
		int i2 = 200;
		long l2 = i2; // 묵시적 형 변환
		
		long l3 = 300;
		int i3 = (int)l3; // 명시적 형 변환
	}

}
