package ch11;

//import가 필요 없는 경우 : 같은 패키지, java.lang 클래스들
import java.lang.*;

class Point1 {

}

public class ObjectEx1 {

	public static void main(String[] args) {
		Point1 p = new Point1();
		Point1 p1 = new Point1();
		System.out.println(p.getClass());
		// 객체를 구분하는 정수값
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
		System.out.println(p==p1);
		System.out.println(p.equals(p1));
		System.out.println(p.toString()); //-> p.toString == p.hashCode()
		
		String s = new String("hi");
		System.out.println(s.toString());
	}

}
