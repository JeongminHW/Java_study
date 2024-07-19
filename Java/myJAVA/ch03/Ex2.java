package ch03;

public class Ex2 {
	public static void main(String[] args) {
		System.out.println("hello");
		int a = 1;
		int b = 1;
		int a1 = a++; //대입 하고 증가
		int b1 = ++b; //증가하고 대입
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a1);
		System.out.println(b1);
	}
}
