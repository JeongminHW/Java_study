package ch03;

import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		/* Math.max(a, b); */
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		if(c%2==0) { // 실행하는 코드가 한 줄이면 중괄호 생략 가능
			System.out.println(c + " 짝수");
		}
		else
			System.out.println(c + " 홀수");
	}

}
