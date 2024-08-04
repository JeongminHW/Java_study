package ch08;

interface Interface_2 {
	// 자동으로 static fianl 선언됨
	// 인터페이스는 일반적인 필드 선언 불가
	int a = 10;
	void prn(); //추상메소드는 body(구현부)를 가질 수 없음
}

//인터페이스끼리 상속 가능(다중 상속 가능)
interface Interface2_1 extends Interface_2{
	void prn2();
}

class Myclass2 implements Interface2_1{

	@Override
	public void prn() {
	}

	@Override
	public void prn2() {
	}
	
}

public class Interface2 {

	public static void main(String[] args) {

	}

}
