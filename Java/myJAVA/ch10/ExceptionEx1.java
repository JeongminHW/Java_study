package ch10;

public class ExceptionEx1 {

	public static void main(String[] args) {
		try { 
			// 예외가 일어날 가능성이 있는 코드가 들어가는 영역
			int a = 10, b = 0;
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b); // 예외 발생
			System.out.println(a%b); // 예외 발생 시 실행 X
			System.out.println("집");
					} catch (Exception e) {
			// 예외가 일어나면 실행되는 영역
			System.out.println(e.getMessage());
			System.err.println("예외");
		}
	}

}
