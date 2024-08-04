package ch13;
import java.util.*;

// Vector : Collection 클래스의 대표 클래스
public class VectorEx1 {

	public static void main(String[] args) {
		//Object 타입의 객체를 저장하는 클래스
		Vector vec = new Vector();
		System.out.println(vec.size()); //크기 지정 안했으므로 0
		System.out.println(vec.capacity()); //
		System.out.println();
		
		boolean flag = vec.add("하하");
		System.out.println(flag);
		vec.add(new String("호호"));
		vec.add(Integer.valueOf(22));
		vec.add(23); // 자동으로 Integer 타입 변환
		System.out.println(vec.size());
		System.out.println();
		
		// 배열과 Vector 밑에 항상 for문 존재
		for(int i=0; i<vec.size(); i++) {
			//vec.elementAt() == vec.get()
			System.out.println(vec.get(i));
		}
		System.out.println();
		for (Object obj : vec) { //foreach 문
			System.out.println(obj);
		}
	}

}
