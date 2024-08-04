package ch13;

import java.util.*;

public class VectorEx2 {

	public static void main(String[] args) {
		String city[] = { "노르웨이", "스위스", "뉴질랜드", "덴마크", "캐나다" };
		Vector vec1 = new Vector();
		Vector<String> vec2 = new Vector();
		
		for(int i = 0; i<city.length; i++) {
			vec1.add(city[i]);
			vec2.add(city[i]);
		}
		
		for(int i = 0; i<vec1.size(); i++) {
			String s1 = (String)vec1.get(i);
			String s2 = vec2.get(i); // 타입일치
			System.out.println(s1 + s2);
		}
		
		for (Object obj : vec1) { //String 타입이 아니므로 Object로 받아야함
			
		}
		
		for (String string : vec2) {
			
		}
	}

}
