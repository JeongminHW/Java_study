package ch03;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			//입력을 계속 받음
			System.out.print("숫자를 입력하세요. : ");
			//쓰레드 중지 상태 -> 키보드를 입력하면 다시 실행
			int a = sc.nextInt();
			//입력한 숫자가 3의 배수인지 판단
			//조건 : 0은 3의 배수가 아닙니다.
			if(a!=0 && a%3==0)
				System.out.println("3의 배수 입니다.");
			else
				System.out.println("3의 배수가 아닙니다.");
		}
	}

}
