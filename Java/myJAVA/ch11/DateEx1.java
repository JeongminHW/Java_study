package ch11;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateEx1 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		System.out.println(d.toLocaleString());
		System.out.println(System.currentTimeMillis());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf.format(d));
		System.out.println(sdf1 .format(d));		
	}

}
