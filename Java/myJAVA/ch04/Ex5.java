package ch04;

public class Ex5 {

	public static void main(String[] args) {
		//제어문은 중첩 가능
		int a = 10;
		if(a>0) {
			if(a%2==0)
				System.out.println("양수이고 짝수");
			else
				System.out.println("양수이고 홀수1");
		}
		else if(a<0) {
			System.out.println("음수입니다.");
		}
	}

}
