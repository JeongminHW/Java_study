package ch06;

class Super {
	String name;

	void prn() {
		System.out.println(name);
	}
}

class Sub extends Super {
	int name;
	@Override
	void prn() {
		System.out.println(super.name); //은닉 변수
		System.out.println(name); //자기 자신의 name
	}
}

public class ThisEx3 {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.prn();
		
		//메인메소드에서(현재 위치) Sub클래스의 this, super라는 키워드 사용 가능? 불가능
		//sub 레퍼런스 변수로 Super클래스 prn 호출 가능? 불가능
	}

}
