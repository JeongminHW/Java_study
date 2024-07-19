package ch04;

public class Ex3 {

	public static void main(String[] args) {
		String month = new String("feburary");
		switch(month) {
		case "january":
			System.out.println("1월");
			break;
		case "feburary":
			System.out.println("2월");
			break;
		case "march":
			System.out.println("3월");
			break;
		case "april":
			System.out.println("4월");
			break;
		default:
			System.out.println("4월 이후");
		}
		
		System.out.println();
		
		// 기본형의 값 비교는 '=='을 사용하지만 객체의 값을 비교할 때는 equals를 사용해야함
		if(month.equals("january"))
			System.out.println("1월");
		else if(month.equals("feburary"))
			System.out.println("2월");
		else if(month.equals("march"))
			System.out.println("3월");
		else
			System.out.println("4월 이후");
	}

}
