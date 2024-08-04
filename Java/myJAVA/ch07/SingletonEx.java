package ch07;

class Singleton {
	// 객체를 무조건 하나밖에 만들지 않음
	private static Singleton instance = null; // 모든 객체에 접근 가능하도록 static 선언(하나만 만듦)

	// 외부에서 객체를 생성할 수 없도록 막아버림
	private Singleton() {
		// DB 연결 객체 10개 생성했다고 가정

	}

	public static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		return instance;
	}
}

public class SingletonEx {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			Singleton st = Singleton.getInstance();
			System.out.println(st);
		}
	}

}
