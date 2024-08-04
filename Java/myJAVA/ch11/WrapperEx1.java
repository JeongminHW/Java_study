package ch11;

import java.util.*;

public class WrapperEx1 {

	public static void main(String[] args) {
		// byte, short, int(약어), long
		// float, double
		// char(약어), boolean
		int a = 10;
		Integer i = a; // Auto Boxing
		Vector v = new Vector();
		v.add(new String("aaa"));
		v.add(new Object());
		v.add(a); // 오토 박싱 : Integer 타입 저장
		int c = (Integer) v.get(2); // 오토 언박싱
		System.out.println(c);
		
		Integer i1 = new Integer(a);
		Integer i2 = new Integer("22");
		Integer i3 = Integer.valueOf(a);
		Integer i4 = Integer.valueOf("22"); //integer 타입 리턴
		int d = i4.intValue(); //Auto Boxing을 사용하지 않을 경우 사용
		int e = Integer.parseInt("23"); //숫자 형태의 문자열을 int로 변환
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.toBinaryString(e));
		System.out.println(Integer.toOctalString(e));
		System.out.println(Integer.toHexString(e));
		
		String s1 = "3.14";
		double d1 = Double.parseDouble(s1);
		System.out.println(d1*d1*Math.PI);
	}

}
