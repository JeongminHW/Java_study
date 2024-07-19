package ch06;

/*
접근 제어자 : 클래스, 필드, 메소드
1. private(0.1%) -> Math
2. protected (0.01%)
3. public(99.9%)

*/

class Access1 {
	public int a = 0; // 어디에서나 접근 가능
	protected int b = 0; // 상속 또는 같은 package일 때 접근 가능
	private int c = 0; // 자신의 클래스 내에서만 접근 가능
}

// AccessEx1.java : 클래스명.java 선언된 클래스만 public이고 다른 클래스(Access1)는 public 선언 불가(문법에러)
public class AccessEx1 {

	public static void main(String[] args) {

	}

}
