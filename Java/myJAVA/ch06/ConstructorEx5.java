package ch06;

class This5 {
	int a;
	String str;

	This5() {
		// 생성자 기본 기능
	}

	This5(int a) {
		// 생성자의 기본 기능
		this.a = a;
	}

	This5(String str) {
		// 생성자 기본 기능
		this.str = str;
	}

	This5(int a, String str) {
		// 생성자 기본 기능
		this.a = a;
		this.str = str;
	}
}

class This6 {
	int a;
	String str;
	
	This6(){
		this(10, "익명");
	}

	This6(String str) {
		this(10, str);
	}

	This6(int a) {
		// super(); //this() 생성자 호출 시 super() 호출 불필요
		this(a, "익명"); // (this가 아래의 this6 생성자에서 호출된 것이기 때문에 super가 필요 없음) 생성자의 첫번째 라인에 선언
	}

	This6(int a, String str) {
		super(); // 생략되어있음
		this.a = a;
		this.str = str;
		// 생성자 기본 기능
	}
}

public class ConstructorEx5 {

	public static void main(String[] args) {
	}

}
