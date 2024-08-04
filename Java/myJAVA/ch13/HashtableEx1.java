package ch13;
import java.util.*;

public class HashtableEx1 {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("사과", "Apple");
		ht.put("바나나", "Banana");
		ht.put("복숭아", "Peach");
		ht.put("딸기", "Strawbery");
		ht.put("딸기", "Erdbeeren");
		System.out.println(ht.size());
		
		//key 값으로 value에 접근하는 방식의 자료구조
		Enumeration<String> e = ht.keys();
		while(e.hasMoreElements()) {
			String key = e.nextElement();
			String value = ht.get(key);
			System.out.println(key + " " + value);
		}
	}

}
