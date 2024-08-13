package ch14;

import java.io.*;

public class InputStreamEx1 {

	public static void main(String[] args) {
		InputStream is = System.in; //키보드로 입력
		
		//io의 메소드는 대부분 예외처리
		while(true) {
			try {
				int a = is.read(); //내부적인 스레드 : 입력 전 대기 상태
				if(a == -1) break;
				System.out.println((char)a);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
