package ch08;

interface Calc {
	// 추상메소드이기 때문에 abstract를 사용하지 않음 (추상메소드 : 선언부만 존재하고 구현부는 존재하지 않음)
	void plus(int a, int b);
}

//implements : 여러개의 인터페이스가 구현되어 있음
class Function extends Object implements Calc{
	@Override
	public void plus(int a, int b) {
	}
}

class Graphic implements Calc{
	@Override
	public void plus(int a, int b) {
	}
}

public class Interface {
	public static void main(String[] args) {

	}
}
