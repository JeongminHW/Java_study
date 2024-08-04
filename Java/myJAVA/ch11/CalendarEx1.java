package ch11;

import java.util.Calendar;

public class CalendarEx1 { // 캘린더는 추상클래스

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println("오늘의 날짜는");
		System.out.println(cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) + "월 " + cal.get(Calendar.DATE) + "일");
		
		int ampm = cal.get(Calendar.AM_PM);
		if(ampm == Calendar.AM)
			System.out.println("오전");
		else
			System.out.println("오후");
		System.out.println(cal.get(Calendar.HOUR) + "시 " + cal.get(Calendar.MINUTE) + "분 " + cal.get(Calendar.SECOND) + "초");
	}

}
