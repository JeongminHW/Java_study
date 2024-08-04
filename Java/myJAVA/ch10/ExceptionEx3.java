package ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		Scanner s = null;
		try {
			int a, b;
			s = new Scanner(System.in);
			System.out.print("1 : ");
			a = s.nextInt();
			System.out.print("2 : ");
			b = s.nextInt();
			System.out.println(a/b);
		} 
		// 다중 캐치는 예외객체의 순서를 지켜야 한다.
		// 상위 Exception 클래스가 먼저 오면 절대 안됨(컴파일 오류)
		catch (ArithmeticException e1) {
			System.err.println("0으로 나눌 수 없음");
		} catch (InputMismatchException e2) {
			System.out.println("숫자만 입력");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			s.close(); // 사용 후 반드시 클로즈
		}
	}

}
