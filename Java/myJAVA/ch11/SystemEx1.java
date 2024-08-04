package ch11;

public class SystemEx1 {

	public static void main(String[] args) {
		System.out.println("출력");

		// 1/1000s : 1970/1/1 ~ 현재
		long time = System.currentTimeMillis();
		System.out.println(time);
		System.exit(0); //자바 프로그램 종료, 0은 정상적인 종료
	}

}
