package ch04;

import java.util.Iterator;

public class Ex11 {

	public static void main(String[] args) {
		// 중첩 for문
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(i + " + " + j + " = " + (i + j));
			}
		}
		System.out.println();
		
		
		for(int i =1;i<5;i++) {
			for(int j = 1; j<10;j++) {
				if(i+j>10) {
					break;
				}
				System.out.println(i + " + " + j + " = " + (i + j));
			}
		}
		System.out.println();
		
		
		aaa: //라벨값 : 구역의 시작 위치
		for(int i = 0;i<5;i++) {
			for (int j = 0; j < 10; j++) {
				if(i+j>10) {
					break aaa; //중첩문을 전체 빠져나옴
				}
				System.out.println(i + " + " + j + " = " + (i + j));
			}
		}
		System.out.println();
		
		//중첩 for문을 이용해서 i+j의 합이 30이 넘으면 break
		bbb:
		for (int i = 1; true; i++) {
			for (int j = 1; true; j++) {
				if(i+j>30) {
					break bbb;
				}
				System.out.println(i + " + " + j + " = " + (i + j));
			}
		}
		System.out.println();
		
		
		
		
		
		
		
	}
}
