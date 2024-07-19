package ch06;

// static : 필드, 메소드, 클래스(조건이 맞을 때)
// 필드 및 메소드 : 객체 생성 없이 클래스명으로 JVM 메모리를 로딩하여 사용가능한 문법
// 

class Static1 {
	
	static class InnerClass { // 내부 클래스에는 static 선언 가능(거의 사용 x)
		
	}
	static int a = 0;
	int b = 0; // non-static

	static void prn1() {
		// static 메소드에는 non-static 필드는 사용 불가
		// non-static 필드는 반드시 객체를 생성해야 사용 가능
		System.out.println(a);
	}

	void prn2() {
		System.out.println(a + b);
	}
}

public class StaticEx1 {

	public static void main(String[] args) {
		Static1 s = new Static1();
		// s.a = 10;
		Static1.a = 10;
		s.b = 20;
		Static1.prn1();
		s.prn2();
		// static 필드 및 메소드는 객체 생성 없이 사용하라는 기능
		// 결국 static 필드 및 메소드는 객체 생성 없이 특정한 필드 및 메소드만 독립적으로 사용할 목적

		double d = 3.124578;
		// Math.mt = new Math();
		long c = Math.round(d);
		System.out.println(c);
		System.out.println(Math.PI);
		String str1 = "10";
		String str2 = "20";
		System.out.println(str1 + str2);
		// String Integer = new String(); // 클래스명은 예약어가 아니므로 사용 가능
		System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));
	}

}
