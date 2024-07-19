package ch03;

public class Ex5 {

	public static void main(String[] args) {
		// 논리연산 : &, &&, |, ||
		
		int a = 10;
		int b = 5;
		
		System.out.println((a==b)&(a>b)); //앞의 조건을 실행하고 뒤의 조건을 실행
		System.out.println((a!=b)&&(a>b)); //앞의 조건을 실행하고 뒤의 조건을 실행하지 않음
		int c = 0;
		/* System.out.println((a==b)&(a/c>b)); */
		System.out.println((a==b)&&(a/c>b));
		
		System.out.println((a!=b)|(a<b));
		System.out.println((a!=b)||(a<b)); // true를 전제하에 뒤의 조건을 실행하지 않음
		//System.out.println((a==b)||(a/c>b));
		
		//XOR : 배타적 논리값 -> 값이 서로 다르면 true, 같으면 false
		System.out.println((a==b)^(a>b));
		System.out.println((a!=b)^(a>b));
	}

}
