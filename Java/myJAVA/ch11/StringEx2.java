package ch11;

import java.util.Iterator;

public class StringEx2 {

	public static void main(String[] args) {
		String str = "Java Programming"; // 한번 만들어진 문자열은 변경되지 않고 고정됨
		//str +="!!!";
		System.out.println(str);
		
		int len = str.length();
		System.out.println(len);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		String str2 = str.substring(5); //5번째 부터 출력
		String str3 = str.substring(5, 10); //5번째부터 9번째까지 출력
		System.out.println(str2);
		System.out.println(str3);
		
		char c1 = str.charAt(6);
		System.out.println(c1 + "\n");
		
		//짝수 문자만 출력
		for(int i = 0; i< len; i++) {
			if(i%2 == 0) {
				System.out.print(str.charAt(i));
			}
		}
		System.out.println();
		
		int idx1 = str.indexOf('a'); // 앞에서 부터 a가 처음 나오는 위치
		System.out.println(idx1);
		
		int idx2 = str.lastIndexOf('a'); // 뒤에서부터 검색
		System.out.println(idx2);
		
		int idx3 = str.indexOf('z');
		System.out.println(idx3 + "\n"); // -1 : 없음
		
		// a를 'q'로 변환하여 출력
		for(int i = 0; i < len; i++) {
			if(str.charAt(i)=='a') {
				System.out.print('q');
			}
			else
				System.out.print(str.charAt(i));
		}
		System.out.println();
		
		String str4 = str.replace('a', 'q');
		System.out.println(str4);
		System.out.println();
		
		// str 반대로 출력
		for(int i = len-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb + "\n");
		
		String str5 =  "Java&JSP&Flutter&Iot&Spring";
		String[] str6 = str5.split("&");
		for(int i = 0; i<str6.length; i++) {
			System.out.println(str6[i]);
		}
		System.out.println();
		
		String str7 = "     JSPStudy     ";
		System.out.println(str7.trim());
		
		int idx4 = 35;
		// 정수 -> 문자열
		String str8 = String.valueOf(idx4);
		String str9 = idx4 +"";
		
		System.out.println(str8);
		System.out.println(str9);
	}

}
